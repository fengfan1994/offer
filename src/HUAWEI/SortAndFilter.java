package HUAWEI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SortAndFilter {
    public void sort(int num,int[] inputArray){
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(inputArray);
        for(int i=0;i<inputArray.length;i++){
            hs.add(inputArray[i]);
        }
        for(int i:hs){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int[] nums=new int[1000];
        while(sc.hasNext()){
            num=sc.nextInt();
        }
    }
}
