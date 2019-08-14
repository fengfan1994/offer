package Leetcode;

public class MinWindowSubString {
    public String minWindow(String S, String T) {
        int[] map=new int[128];
        for(int i=0;i<T.length();i++){
            map[T.charAt(i)]++;
        }
        int begin=0,end=0,count=T.length(),head=0,len=Integer.MAX_VALUE;
        while(end<S.length()){
            if(map[S.charAt(end++)]-->0){
                count--;
            }
            while(count==0){
                if(len>end-begin){
                    head=begin;
                    len=end-begin;
                }
                if(map[S.charAt(begin++)]++ == 0) {  // begin开始后移，继续向后寻找。如果begin后移后指向的字符在map中==0，表示是在T中出现的，如果没有出现，map[]中的值会是负值。
                    count++;                      // 在T中的某个字符从窗口中移除，所以counter++。
                }
            }
        }
        return len==Integer.MAX_VALUE?"":S.substring(head,head+len);
    }
}
