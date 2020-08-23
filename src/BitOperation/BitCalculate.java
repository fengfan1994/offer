package BitOperation;

public class BitCalculate {
    public int add(int a,int b){
        int sum=a;
        while(b!=0){
            sum=a^b;
            b=(a&b)<<1;
            a=sum;
        }
        return sum;
    }

    public int minus(int a,int b){
        return add(a,negnum(b));
    }

    public int negnum(int n){
        return add(~n,1);
    }

    public int multi(int a,int b){
        int res=0;
        while(b!=0){
            if((b&1)!=0){
                res=add(res,a);
            }
            a<<=1;
            b>>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        BitCalculate bc=new BitCalculate();
        System.out.println(bc.add(3,4));
        System.out.println(bc.minus(3,4));
        System.out.println(bc.multi(4,5));
    }
}
