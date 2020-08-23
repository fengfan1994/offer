package AimToOffer.chapter05;

public class GreatSumOfArray {
    public int FindGreatSum(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int cur=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cur<0){
                cur=nums[i];
            }else{
                cur=cur+nums[i];
            }

            if(cur>max){
                max=cur;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums={1,-2,3,10,-4,7,2,-5,10};
        System.out.println(new GreatSumOfArray().FindGreatSum(nums));
    }
}
