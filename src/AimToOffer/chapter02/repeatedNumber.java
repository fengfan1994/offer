package AimToOffer.chapter02;

import java.util.HashSet;

public class repeatedNumber {

    public static void main(String[] args){
        int[] num={2,5,4,7,2,6,7,27,7,8,8,12};
        new repeatedNumber().repeatedNum(num);
    }
    public void repeatedNum(int[] num){
        int length=num.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(num[i]==num[j]){
                    hs.add(num[i]);
                }
            }
        }
        for(Integer a:hs){
            System.out.println(a);
        }
    }
}
