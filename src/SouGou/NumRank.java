package SouGou;

import java.util.*;
import java.util.HashSet;
import java.util.List;

public class NumRank {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int len=sc.nextInt();
                int[] nums=new int[len];
                HashSet<Integer> hs=new HashSet<>();
                for(int i=0;i<len;i++){
                    nums[i]=sc.nextInt();
                    hs.add(nums[i]);
                }
                //所有数的个数
                int size=hs.size();

                HashSet<Integer> hs1=new HashSet<>();
                List<Integer> list=new ArrayList<>();
                if(size==1){
                    for(int i=1;i<=len;i++){
                        list.add(i);
                        list.add(i);
                    }
                }else{
                    for(int i=0;i<len;i++){
                        hs1.add(nums[i]);
                        for(int j=i+1;j<len;j++){
                            hs1.add(nums[j]);
                            if(hs1.size()==size){
                                list.add(i);
                                list.add(j);
                                hs1.clear();
                                break;
                            }
                        }
                    }
                }

                int min=list.get(1)-list.get(0)+1;
                for(int i=0;i<list.size();i=i+2){
                    int temp=list.get(i+1)-list.get(i)+1;
                    if(min>temp){
                        min=temp;
                    }
                }
                System.out.print(min+" ");
                int count=0;
                for(int i=0;i<list.size();i=i+2){
                    int temp=list.get(i+1)-list.get(i)+1;
                    if(min==temp){
                        count++;
                    }
                }
                System.out.println(count);
                for(int i=0;i<list.size();i=i+2){
                    int temp=list.get(i+1)-list.get(i)+1;
                    if(min==temp){
                        System.out.print("["+(list.get(i)+1)+","+(list.get(i+1)+1)+"] ");
                    }
                }
            }
        }
}
