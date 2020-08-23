package xiaozhao2018;

import java.util.ArrayList;
import java.util.List;

//从0-n选出k个数组成目标和的所有方式
public class countOfSumNum {


    public static void printList(int m, int n, List<Integer> list) {
        // m=0时，即背包刚好装满，打印并退出
        if (m == 0) {
            System.out.println(list);
            return;
        }

        // 根据题意，可知m和n必须为正整数，所以m和n为负数，或n=0时，直接退出
        if (n <= 0 || m < 0) {
            return;
        }

        // 拿到上一次计算的结果list
        List<Integer> list1 = new ArrayList<Integer>(list);

        // n没有加入
        printList(m, n - 1, list);

        // n加入
        list1.add(n);
        printList(m - n, n - 1, list1);
    }

}
