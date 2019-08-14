package HUAWEI;

import java.util.*;
//埃及分数,有公式
//b/a得到商q和余数r
//核心公式： a/b = 1/(q+1) + (a- r) / b(q+1)
public class EgyptNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] s = sc.next().split("/");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            StringBuffer sb = new StringBuffer();
            while (a != 1) {
                if (b % (a - 1) == 0) {
                    sb.append("1/" + b / (a - 1) + "+");
                    a = 1;
                } else {
                    int q = b / a; //求得 b/a 的商
                    int r = b - a * q; // 求得 b /a 的余数
                    sb.append("1/" + (q + 1) + "+");
                    a = a - r;
                    b = b * (q + 1);
                    if (b % a == 0) {
                        b = b / a;
                        a = 1;
                    }
                }
            }
            sb.append("1/" + b);
            System.out.println(sb);
        }
        sc.close();
    }
}
