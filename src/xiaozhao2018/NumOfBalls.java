package xiaozhao2018;
import java.util.*;
public class NumOfBalls {

    public static void backtrack(ArrayList<String> res, String s, int[] num, int n, int index) {
        if(index == num.length) {
            if(n == 0)
                res.add(s);
            return;
        }
        for(int i = 0; i <= num[index] && i <= n; i++) {  //i是第index位的数字
            backtrack(res, s + i, num, n - i, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int[] num = new int[k];
        for(int i = 0; i < k; i++) {
            num[i] = input.nextInt();
        }
        ArrayList<String> res = new ArrayList<String>();
        String s = "";
        backtrack(res, s, num, n, 0);
        for(String s1 : res) {
            System.out.println(s1);
        }
    }
}
