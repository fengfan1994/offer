package xiaozhao2018;

import java.util.Scanner;

public class DivideByThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(r-l+1-getCount(r)+getCount(l-1));
        }
    }

    public static int getCount(int n){
        return (n+2)/3;
    }


}
