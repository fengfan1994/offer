package StringMath;
//将一个字符串移动n位
public class MoveString {
    public static String getResults(String s,int n){
        int len=s.length();
        n=n%len;
        String s1=s.substring(n);
        String s2=s.substring(0,n);
        return s1+s2;
    }

    public static void main(String[] args) {
        String s=getResults("abcd",5);
        System.out.println(s);
    }
}
