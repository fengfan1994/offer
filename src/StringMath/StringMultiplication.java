package StringMath;

import java.sql.SQLOutput;

//字符串进行大数乘法计算，结果返回字符串
public class StringMultiplication {
    public static void getResults(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        //将数字倒序存储在两个数组中
        int[] num1=new int[len1];
        for(int j=0,i=len1-1;i>=0;i--){
            num1[j++]=s1.charAt(i)-'0';
        }
        int[] num2=new int[len2];
        for(int j=0,i=len2-1;i>=0;i--){
            num2[j++]=s2.charAt(i)-'0';
        }
        int[] result=new int[len1+len2];
        //用第二个数乘第一个数
        for(int i=0;i<len2;i++){
            for(int j=0;j<len1;j++){
                result[i+j]+=num2[i]*num1[j];
            }
        }

        //统一处理进位
        for(int i=0;i<len1+len2;i++){
            System.out.println(result[i]);
            if(result[i]>=10){
                result[i+1]+=result[i]/10;
                result[i]=result[i]%10;
            }
        }
        int len=0;
        for(int i=len1+len2-1;i>=0;i--){
            if(result[i]!=0){
                len=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=len;i>=0;i--){
           sb.append(result[i]);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        getResults("13247","321");
    }
}
