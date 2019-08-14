package xiaozhao2018;

import java.util.List;

public class PlantTree {
    static int n,m;
    static int[] tree;
    static List<String> ans;

    static boolean check(int left){
        for(int i=1;i<=n;i++){
            if(tree[i]>(left+1)/2)return false;
        }
        return true;
    }

    static boolean dfs(int idx){
        if(!check(m-idx)) return false;
        if(idx==m){
            return true;
        }else{
            for(int i=1;i<=n;i++){
                if(idx==0 || (tree[i]!=0 && i!=Integer.valueOf(ans.get(idx-1))) ){
                    tree[i]--;
                    ans.add(i+"");
                    if(dfs(idx+1)) return true;
                    ans.remove(ans.size()-1);
                    tree[i]++;
                }
            }
        }
        return false;
    }
}
