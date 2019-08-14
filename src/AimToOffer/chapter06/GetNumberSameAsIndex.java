package AimToOffer.chapter06;

public class GetNumberSameAsIndex {
    public int getNumberSameAsIndex(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=left+(right-left)>>1;
            if (nums[middle]==middle) {
                return nums[middle];
            }
            if(nums[middle]>middle){
                right=middle-1;
            }else{
                left=middle+1;
            }
        }
        return -1;
    }
}
