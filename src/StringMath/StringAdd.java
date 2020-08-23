package StringMath;
//用字符串实现大数相加
public class StringAdd {
    public static void main(String[] args) {
        String str1="1234";
        String str2="11978681589125386512";

        System.out.println(new StringAdd().addBinary(str1,str2));
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            res.append(sum % 10);
            carry = sum / 10;
        }
        //res是倒序，必须进行反转
        return res.reverse().toString();
    }


}
