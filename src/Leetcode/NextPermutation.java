package Leetcode;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int pos = -1;
        // 找到最后一个升序位置
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                pos = i - 1;
                break;
            }
        }
        // 如果没有升序 如3 2 1 需要反转为1 2 3
        if (pos < 0) {
            nums = reverse(nums, 0, nums.length - 1);
            return;
        }

        // 存在升序 找到pos之后最后一个大于pos的位置
        // 举例 如1 2 5 4 3 1下一个排列应该是 1 3 1 2 4 5，
        // 首先定位pos元素为2；找到元素3；两者交换：1 3 5 4 2 1；将5~1反转；
        for (int i = nums.length - 1; i > pos; i--) {
            if (nums[i] > nums[pos]) {
                int tmp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = tmp;
                break;
            }
        }
        // 将pos之后元素全部反转
        nums = reverse(nums, pos + 1, nums.length - 1);
    }

    public int[] reverse(int nums[], int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return nums;
    }
}
