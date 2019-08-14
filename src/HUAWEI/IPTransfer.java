package HUAWEI;

import java.util.Scanner;

public class IPTransfer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String ip=sc.next();
            long num=sc.nextLong();
            getResult(ip,num);
        }
    }

    //将二进制ip转化为十进制，将十进制ip转化为二进制
    //这里注意数字可能溢出
    public static void getResult(String ip,Long num){
        long result=0;
        java.util.StringTokenizer token=new java.util.StringTokenizer(ip,".");
        //把第一段ip左移24位，后面以此类推
        result+=Long.parseLong(token.nextToken())<<24;
        result+=Long.parseLong(token.nextToken())<<16;
        result+=Long.parseLong(token.nextToken())<<8;
        result+=Long.parseLong(token.nextToken());
        StringBuilder sb=new StringBuilder();
        sb.append(num>>>24);sb.append(".");
        sb.append(String.valueOf((num & 0x00FFFFFF)>>>16));
        sb.append(".");
        sb.append(String.valueOf((num & 0x0000FFFF)>>>8));
        sb.append(".");
        sb.append(String.valueOf((num & 0x000000FF)));
        System.out.println(result);
        System.out.println(sb.toString());

    }
}
