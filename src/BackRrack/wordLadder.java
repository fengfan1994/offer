package BackRrack;
import java.util.*;

public class wordLadder {

    public static void main(String[] args) {
        String start="hit";
        String end="cog";
        HashSet<String> dict=new HashSet<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        new wordLadder().ladderLength(start,end,dict);
    }
    //使用广度优先搜索完成任务
    public int ladderLength(String start, String end, HashSet<String> dict) {
        Queue<String> que = new LinkedList<String> ();
        HashSet<String> visited = new HashSet<String> ();
        Queue<Integer> num = new LinkedList<Integer> ();

        que.add(start);
        num.add(1);
        visited.add(start);

        while(!que.isEmpty()){
            //删除第一个
            String str = que.remove();
            int nums = num.remove();
            if(str.equals(end))
                return nums;
            for(int i = 0; i < start.length(); ++i){
                char [] arr = str.toCharArray();
                for(char c = 'a'; c <= 'z'; ++c){
                    arr[i] = c;
                    String next = new String(arr);
                    //String next = str.substring(0,i) + c + str.substring(i+1,start.length());
                    if(dict.contains(next) && !visited.contains(next)){
                        //加入到最后一个
                        que.add(next);
                        System.out.println(next);
                        num.add(nums+1);
                        System.out.println(num);
                        visited.add(next);
                    }
                }
            }
        }

        return 0;
    }
}
