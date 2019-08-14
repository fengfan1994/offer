package NiuKe.Basement;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println(9/10);
    }

    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> list1=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0){
                    list1.add(1);
                }else if(j<i-1){
                    list1.add(list.get(i-2).get(j-1)+list.get(i-2).get(j));
                }else{
                    list1.add(1);
                }
            }
            list.add(list1);
        }
        return list;
    }
}
