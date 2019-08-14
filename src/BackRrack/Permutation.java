package BackRrack;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public ArrayList<ArrayList<Integer>> lists;

    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        lists=new ArrayList<>();
        if(num==null || num.length==0){
            return lists;
        }
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] used=new boolean[num.length];
        Arrays.sort(num);
        permutations(num,list,used);
        return lists;
    }

    public void permutations(int[] num, ArrayList<Integer> list, boolean[] used){
        if(list.size()==num.length){
            lists.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(used[i] || (i> 0 && num[i] == num[i-1] && !used[i - 1])){
                continue;
            }
            used[i]=true;
            list.add(num[i]);
            permutations(num,list,used);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }

}
