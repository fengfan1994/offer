package Leetcode;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates1(int[] A) {
        if (A.length <= 1)
            return A.length;
        int index = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                if (index == 0)
                    index = i;
            } else if (index != 0) {
                A[index] = A[i];
                index++;
            }
        }
        return index == 0 ? A.length : index;
    }

    public int removeDuplicates2(int[] A) {
        int n=A.length;
        if(n<=2) return n;
        int index=2;//允许重复两次，可以修改为三次
        for(int i=2;i<n;i++)
        {
            if(A[i]!=A[index-2])//允许重复两次，可以修改为三次
                A[index++]=A[i];
        }
        return index;
    }
}
