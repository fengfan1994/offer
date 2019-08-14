package xiaozhao2018;

import java.util.*;
import java.util.PriorityQueue;

public class CowNum {
    public int getCowNum(int[] arr){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        long result = 1 ;
        for(int i = 0 ; i < n ;i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for(int j = 0; j < n ;j++){
            result *= (x[j] - j);
            result %= 1000000007;
        }
        System.out.println(result);
        return (int)result;
    }
}
