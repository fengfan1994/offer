package StringMath;

import java.util.Stack;

public class StringMath {
    //求字符串表达式的值，不含括号
    public static int getResult(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<ch.length){
            if(ch[i]>='0' && ch[i]<='9'){
                stack.push(ch[i++]);
            } else if(ch[i]=='+' || ch[i]=='-'){
                stack.push(ch[i++]);
            }else{
                int k=i;
                int n1=0,n2=0,base=1;
                while(!stack.isEmpty()){
                    if(stack.peek()>='0' && stack.peek()<='9'){
                        n1=n1+Integer.parseInt(stack.pop()+"")*base;
                        base=base*10;
                    }else{
                        break;
                    }
                }
                i=i+1;
                while(i<ch.length){
                    if(ch[i]>='0' && ch[i]<='9'){
                        n2=n2*10+Integer.parseInt(ch[i]+"");
                        i++;
                    }else {
                        break;
                    }
                }
                if(ch[k]=='*'){
                    String res=n1*n2+"";
                    char[] temp=res.toCharArray();
                    for(int j=0;j<temp.length;j++){
                        stack.push(temp[j]);
                    }
                }
                if(ch[k]=='/'){
                    String res=n1/n2+"";
                    char[] temp=res.toCharArray();
                    for(int j=0;j<temp.length;j++){
                        stack.push(temp[j]);
                    }
                }
            }
        }
        Stack<Character> result=new Stack<>();
        while(!stack.isEmpty()){
            result.push(stack.pop());
        }
        int res=0,num1=0,base=1;
        while(!result.isEmpty()){
            if(result.peek()>='0' && result.peek()<='9') {
                res=res*base+Integer.parseInt(result.pop()+"");
                base=10;
            }else{
                break;
            }
        }

        while(!result.isEmpty()){
                char op=result.pop();
                base=1;num1=0;
                while(!result.isEmpty()){
                   if(result.peek()>='0' && result.peek()<='9') {
                       num1=num1*base+Integer.parseInt(result.pop()+"");
                       base=10;

                   }else{
                       break;
                   }
                }
                if(op=='+'){
                    res=res+num1;
                }
                if(op=='-'){
                    res=res-num1;
                }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(getResult("89*28+46*58+99+21+39+4+25*46-60+24-99*27-60*5*59-50+14*20*96+22+44+61+24*47*77+7*70-51*43-79*9+30*5+87+86-74+80*78-94+51-77-25-97*77*58-59+43*34-72-0+42-34+16-25+68*2-16-78*100+43*80*88+80"));;
    }

}