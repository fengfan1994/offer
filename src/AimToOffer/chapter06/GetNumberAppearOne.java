package AimToOffer.chapter06;

public class GetNumberAppearOne {
    //数组中每个数字出现3次，只有一个数字出现一次
    public int getNumberAppearOne(int[] nums){
        int[] bitCountForOne=new int[32];
        int res=0;
        for(int i=0;i<32;i++){
            for(int k=0;k<nums.length;k++){
                //求出一个int型第i位的二进制数值
                bitCountForOne[i]+=(nums[k]>>i &1);
            }
            //将这个数还原，不同的位左移对应的位数
            res |=(bitCountForOne[i]%3)<<i;
        }
        return res;
    }

    //数组中除了两个数，其它每个数都出现两次，找出这两个数
    public void getNumsAppearOne(int[] nums,int[] num1,int[] num2){
        if(nums==null){
            return ;
        }
        num1[0]=0;
        num2[0]=0;
        int number=nums[0];
        for(int i=1;i<nums.length;i++){
            number=number^nums[i];
        }
        int index=0;
        while((number &1)==0){
            number=number>>1;
            index++;
        }
        for(int i=0;i<nums.length;i++){
            boolean isBit=((nums[i]>>index) & 1)==0;
            if(isBit){
                num1[0]=num1[0]^nums[i];
            }else{
                num2[0]=num2[0]^nums[i];
            }
        }
    }
}
