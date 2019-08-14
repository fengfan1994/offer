package AimToOffer.chapter06;
//不用乘除法和关键字做加法
public class SumWithCircle {
    public int Sum_Solution(int n){
        int sum=n;
        boolean result=(n>0) && ((sum+=Sum_Solution(n-1))>0);
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
        new SumWithCircle().Sum_Solution(10);
    }
}
