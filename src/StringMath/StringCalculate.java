package StringMath;

import java.util.ArrayList;
import java.util.Stack;

public class StringCalculate {

    public static void main(String[] args) {
        double a = (1 + 2 * (3.0 / 2) / (2 + 8) - (2 * 6.0) / (1 + 7)) - (21 + 3 * (5 - 2 - (7 * (4 - 3))));
        System.out.println(a);
        System.out.println(caculate2("(1+2*(3/2)/(2+8)-(2*6)/(1+7))-(21+3*(5-2-(7*(4-3))))"));
    }

    //对运算符优先级进一步排序  减法大于加法   除法大于乘法
    public static double caculate2(String formula) {
        String[] arr = convert(formula);
        Stack<Double> val = new Stack<>();
        Stack<String> op = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                val.push(caculate2(bracketGet(formula, i)));
                i = i + bracketGet(formula, i).length() + 1;
            } else if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
                while (!op.isEmpty() && opcompare2(op.lastElement(), arr[i])) {
                    switch (op.pop()) {
                        case "+":
                            val.push(val.pop() + val.pop());
                            continue;
                        case "-":
                            double c = val.pop();
                            double d = val.pop();
                            val.push(d - c);
                            continue;
                        case "*":
                            val.push(val.pop() * val.pop());
                            continue;
                        case "/":
                            double a = val.pop();
                            double b = val.pop();
                            val.push(b / a);
                            continue;
                        default:
                            break;
                    }
                }
                op.push(arr[i]);
            } else
                val.push(Double.parseDouble(arr[i]));

        }
        while (!op.isEmpty()) {
            switch (op.pop()) {
                case "+":
                    val.push(val.pop() + val.pop());
                    break;
                case "-":
                    double c = val.pop();
                    double d = val.pop();
                    val.push(d - c);
                    break;
                case "*":
                    val.push(val.pop() * val.pop());
                    break;
                case "/":
                    double a = val.pop();
                    double b = val.pop();
                    val.push(b / a);
                    break;
                default:
                    break;
            }
        }

        return val.pop();
    }

    public static String bracketGet(String s, int k) {
        int m = 0;
        int i;
        String[] arr = convert(s);
        for (i = k; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                m++;
                continue;
            }
            if (arr[i].equals(")")) {
                m--;
                if (m == 0)
                    break;
                else
                    continue;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int j = k + 1; j < i; j++) {
            sb.append(arr[j]);
        }
        return sb.toString();
    }

    public static String[] convert(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!opjudge(s.charAt(i))) {
                int j = i;
                while ((i < s.length()) && !opjudge(s.charAt(i)))
                    i++;
                arrayList.add(s.substring(j, i));
                i--;
            } else
                arrayList.add(String.valueOf(s.charAt(i)));
        }

        return arrayList.toArray(new String[arrayList.size()]);

    }

    public static boolean opjudge(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')')
            return true;
        else
            return false;
    }

    public static int opvalue2(String s) {
        switch (s) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return -1;
        }

    }

    public static boolean opcompare2(String s1, String s2) {
        if (opvalue2(s1) >= opvalue2(s2))
            return true;
        else {
            return false;
        }

    }
}
