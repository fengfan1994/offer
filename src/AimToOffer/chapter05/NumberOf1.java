package AimToOffer.chapter05;

public class NumberOf1 {
    //采用循环计数法，从尾到头以此计算会出现1的个数
    public long numOfOne(int n){
        if(n<=0){
            return 0;
        }
        long count=0;
        int base=1;
        int round=n;
        while(round>0){
            int weight=round % 10;
            round=round/10;
            count+=round*base;
            if(weight==1){
                count+=(n%base)+1;
            }else if(weight>1){
                count+=base;
            }
            base*=10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(new NumberOf1().numOfOne(2119436187));
    }
}
