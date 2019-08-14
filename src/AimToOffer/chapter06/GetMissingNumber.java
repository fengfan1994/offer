package AimToOffer.chapter06;

public class GetMissingNumber {
    public int getMissingNumber(int[] nums,int start,int end){
        if(nums==null || nums.length==0){
            return -1;
        }
        int middleIndex=(start+end)/2;
        int middleData=nums[middleIndex];
        if(middleIndex>0){
            if(middleIndex!=middleData && (middleIndex-1)==nums[middleIndex-1]){
                return middleIndex;
            }else if(middleIndex!=middleData &&(middleIndex-1)!=nums[middleIndex-1] ){
                end=middleIndex;
                return getMissingNumber(nums,start,end);
            }
            else {
                start=middleIndex;
                return getMissingNumber(nums,start,end);
            }
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(new GetMissingNumber().getMissingNumber(nums,0,9));
    }
}
