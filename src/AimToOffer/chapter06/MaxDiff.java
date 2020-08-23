package AimToOffer.chapter06;

public class MaxDiff {
    public int maxDiff(int[] nums){
        int length=nums.length;
        int min=nums[0];
        int maxProfile=nums[1]-min;
        for(int i=2;i<length;i++){
            if(nums[i-1]<min){
                min=nums[i-1];
            }
            int currentProfile=nums[i]-min;
            if(currentProfile>maxProfile){
                maxProfile=currentProfile;
            }
        }
        return maxProfile;
    }
}
