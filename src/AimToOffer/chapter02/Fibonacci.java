package AimToOffer.chapter02;

public class Fibonacci {
    public int calculate(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            int s1=0;
            int s2=1;
            int result=0;
            for(int i=2;i<=n;i++){
                result=s1+s2;
                s1=s2;
                s2=result;
            }
            return result;
        }
    }
    public static void main(String[] args){
        System.out.println(new Fibonacci().calculate(5));
    }
}
