package AimToOffer.chapter02;

public class numberOfOne {
     public int numOfOne(int n){
        int count=0;
        while(n>0){
            ++count;
            n=n&(n-1);
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args){
         new numberOfOne().numOfOne(31);
    }
}
