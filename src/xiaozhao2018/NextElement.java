package xiaozhao2018;

import java.util.Stack;

public class NextElement {

    public static void main(String[] args) {
        int[] nums={4,11,13,10,5,12,21,3};
        new NextElement().getResult(nums);
    }


    public int[] getResult(int[] num){
        if(num==null || num.length==0) {
            return null;
        }
        int[] res=new int[num.length];
        Stack<Integer> rank=new Stack<>();
        Stack<Integer> m=new Stack<>();
        res[num.length-1]=-1;
        for(int i=num.length-2;i>=0;i--){
            while(!rank.isEmpty() && num[i]>rank.peek()){
                m.push(rank.pop());
            }
            if(rank.isEmpty()){
                rank.push(num[i]);
                res[i]=-1;
            }else{
                res[i]=rank.peek();
                rank.push(num[i]);
            }
            while(!m.isEmpty()){
                rank.push(m.pop());
            }

        }
        for(int i:res){
            System.out.print(i+" ");
        }
        return res;
    }
}
