package Leetcode;

public class ReverseInt {
    //自己的方法，思路比较复杂，而且没有考虑溢出问题,比如1234567899没问题，反过来就会溢出
    //-2147483648~2147483647 int 范围
    public int reverseInt1(int target){
        //将数字转化为字符串
        String a=target+"";
        String s="";
        int num=0;
        int result=0;
        String temp="";
        char[] ch=a.toCharArray();
        //三种特殊情况，负数，末尾以0结尾的数，不以0结尾的整数
        if(ch[0]=='-'){
            int len=a.length()-1;
            for(int i=len;i>=1;i--){
                if(ch[i]!='0'){
                    num=i;
                    break;
                }
            }
            for(int j=num;j>=1;j--){
                s=s+ch[j];
            }
            result=Integer.parseInt(s)*-1;
        }else{
            int len=a.length()-1;
            for(int i=len;i>=0;i--){
                if(ch[i]!='0'){
                    num=i;
                    break;
                }
            }
            for(int j=num;j>=0;j--){
                s=s+ch[j];
            }
            result=Integer.parseInt(s);
        }
        return result;
    }
    //基于模运算并且考虑溢出的做法
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInt().reverse(1234567899));
    }
}
