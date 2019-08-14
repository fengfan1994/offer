package AimToOffer.chapter06;

public class ReverseString {
    //翻转一个字符串
    public  static String reverseString(String target){
        char[] chars=target.toCharArray();
        int len=chars.length;
        String sb="";
        for(int i=len-1;i>=0;i--){
            sb+=chars[i];
        }
        return sb;
    }

    public StringBuilder reverseAll(String target){
        char[] chars=target.toCharArray();
        int start=0;
        int end=chars.length-1;
        while(start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        String s="";
        StringBuilder sb=new StringBuilder("");
        for(char c:chars){
            if(c==' '){
               s=s+c;
               sb.append(reverseString(s));
               s="";
            }else{
                s=s+c;
            }
        }
        sb.append(reverseString(s));
        return sb;
    }

    public static void main(String[] args){
        System.out.println(new ReverseString().reverseAll("feng fan ai li ying"));
    }
}
