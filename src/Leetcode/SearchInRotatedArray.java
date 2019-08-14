package Leetcode;

public class SearchInRotatedArray {

    public boolean search(int[] A, int target) {
        if (A == null || A.length == 0) {
            return false;
        }
        int len = A.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return true;
            }
            if (A[left] < A[mid]) {
                if (A[left] <= target && target < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (A[left] > A[mid]) {
                if (target > A[mid] && target <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                left ++;
            }
        }
        return false;
    }

    public int getMin(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int left=0,right=arr.length-1;
        int mid=0;
        while(left<right){
            if(left==right-1){
                break;
            }
            if(arr[left]<arr[right]){
                return arr[left];
            }
            mid=(left+right)/2;
            if(arr[left]>arr[mid]){
                right=mid;
                continue;
            }
            if(arr[mid]>arr[right]){
                left=mid;
                continue;
            }
            while(left<mid){
                if(arr[left]==arr[mid]){
                    left++;
                }else if(arr[left]<arr[mid]){
                    return arr[left];
                }else{
                    right=mid;
                    break;
                }
            }
        }
        return Math.min(arr[left],arr[right]);
    }

    public static void main(String[] args) {
        int[] num={4,5,6,7,1,2,3};
        System.out.println(new SearchInRotatedArray().getMin(num));
    }
}
