package InterviewJinDian;
//检查括号序列是否合法
public class Paretnhesis {
    public static  boolean chkParenthesis(String A, int n) {
        // write code here
        int n1=0;
        int n2=0;
        boolean flag=true;
        for(int i=0;i<=n-1;i++){
            if(n2>n1 || (A.charAt(i)!='(' && A.charAt(i)!=')' )){
                flag=false;
                break;
            }else if(A.charAt(i)=='('){
                n1++;
            }else{
                n2++;
            }
            System.out.println(n1+" "+n2);
        }
        if(n1!=n2){
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {
        String s="()()(((())))";
        System.out.println(chkParenthesis(s,12));
    }
}
