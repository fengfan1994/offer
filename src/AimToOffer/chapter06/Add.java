package AimToOffer.chapter06;

public class Add {
    public int add(int num1,int num2){
        int temp=0;
        while (num2!=0) {
            //表示两个数相加但不进位
            temp= num1 ^ num2;
            //标识进位
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args){
       System.out.println(new Add().add(3,5));
    }
}
