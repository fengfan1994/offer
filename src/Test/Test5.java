package Test;

public class Test5 {
    public static void main(String[] args) {
        int[] m={2,2};
        new Test5().searchRange(m,2);
    }

    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        //递归调用，然后对字符串处理
        String str = countAndSay(n-1) + "*";//为了str末尾的标记，方便循环读数
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for(int i = 0; i < c.length - 1;i++){
            if(c[i] == c[i+1]){
                count++;//计数增加
            }else{
                s = s + count + c[i];//上面的*标记这里方便统一处理
                count = 1;//初始化
            }
        }
        return s;
    }

    public int[] searchRange(int[] A, int target) {
        int low = 0, high = A.length - 1, mid = 0;
        int start = - 1, end = - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if(A[mid] < target) low = mid + 1;
            else if(A[mid] > target) high = mid - 1;
            else {
                start = end = mid;
                while (start >= 0 && A[start] == target) start --;
                while (end < A.length && A[end] == target) end ++;
                return new int[] {start + 1, end - 1};
            }
        }
        return new int[] {start, end};
    }
}
