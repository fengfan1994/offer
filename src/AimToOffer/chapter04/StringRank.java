package AimToOffer.chapter04;

import java.util.*;

public class StringRank {

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int len=num.length;
        permutation(num,0,len-1,list,lists);
        return lists;
    }

    public void permutation(int[] num,int from,int to,ArrayList<Integer> list,
                            ArrayList<ArrayList<Integer>> lists){
        if( num==null || from>to || to<0){
            return;
        }
        if(from==to){
            for(int i=0;i<=to;i++){
                list.add(num[i]);
            }
            lists.add(new ArrayList<Integer>(list));
            list.clear();
            return;
        }
        for(int i=from;i<=to;i++){
            swap(num,i,from);
            permutation(num,from+1,to,list,lists);
            swap(num,i,from);
        }
    }

    private  void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(new StringRank().permute(a));;
    }
}
