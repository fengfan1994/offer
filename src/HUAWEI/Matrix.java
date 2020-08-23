package HUAWEI;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int target=sc.nextInt();
            getResult(target);
        }
    }

    public static void getResult(int n){
        int[][] nums=new int[n][n];
        for(int i=0;i<n;i++){
            nums[i][0]=(i*i+i)/2+1;
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                nums[i][j]=nums[i][j-1]+j+1+i;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
