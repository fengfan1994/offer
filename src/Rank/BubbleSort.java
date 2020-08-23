package Rank;

public class BubbleSort {
    public int[] sort(int[] nums){
        int length=nums.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }


}
