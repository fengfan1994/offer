package HUAWEI;
//将一个long型整数分解质因数，将所有质因数放入数组并以空格为间隔输出
//注意考虑数值溢出
public class PrimeNumber {
    //根据公式球最小公倍数
    public int minParentNum(int num1,int num2){
        return (num1* num2)/gcd(num1,num2);
    }
    //辗转相除法求最大公约数
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    //十六进制转十进制,并未考虑数值溢出
   public static String getNumInTen(String target){
        int result=0;
        char[] ch=target.toCharArray();
        for(int i=ch.length-1;i>=2;i--){
            if(ch[i]>='0'&& ch[i]<='9'){
                int num=ch[i]-'0';
                result=result+num*(int)Math.pow(16,ch.length-1-i);
            }else{
                int num=ch[i]-'A'+10;
                result=result+num*(int)Math.pow(16,ch.length-1-i);
            }
        }
        return result+"";
    }

    public static void main(String[] args) {
        System.out.println(getNumInTen("0x1AA"));;
    }

}
