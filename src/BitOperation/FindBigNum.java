package BitOperation;
//使用位运算找到两个数中较大的那个
public class FindBigNum {
    public int flip(int n){
        return n^1;
    }
    //符号函数
    public int sign(int n){
        return flip(n>>31 &1);
    }

    public int getMax1(int a,int b){
        int c=a-b;
        int sca=sign(c);
        int scb=flip(sca);
        return a*sca+b*scb;
    }
}
