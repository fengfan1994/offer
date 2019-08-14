package AimToOffer.chapter06;

public class GetNumberOfK {
    public int getFirstK(int[] nums,int k,int start,int end,int length){
        int middleIndex=(start+end)/2;
        int middleDta=nums[middleIndex];
        if(k==middleDta){
            if((middleIndex>0 && nums[middleIndex-1]!=k) || middleIndex==0){
                return middleIndex;
            }else{
                end=middleIndex-1;
            }
        }else if(middleDta>k){
            end=middleIndex-1;
        }else{
            start=middleIndex+1;
        }
        return getFirstK(nums,k,start,end,length);
    }

    public int getLastK(int[] nums,int k,int start,int end,int length){
        int middleIndex=(start+end)/2;
        int middleDta=nums[middleIndex];
        if(k==middleDta){
            if((middleIndex<length-1 && nums[middleIndex+1]!=k) || middleIndex==length-1){
                return middleIndex;
            }else{
                start=middleIndex+1;
            }
        }else if(middleDta<k){
            start=middleIndex+1;
        }else{
            end=middleIndex-1;
        }
        return getLastK(nums,k,start,end,length);
    }

    public int getNumberOfK(int[] nums,int length,int k){
        int num=0;
        if(nums!=null && length>0){
            int first=getFirstK(nums,k,0,length-1,length);
            int last=getLastK( nums,k,0,length-1,length);
            if(first>-1 && last>-1){
                num=last-first+1;
            }
        }
        return num;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,3,3,3,4,5};
        System.out.println(new GetNumberOfK().getNumberOfK(nums,8,3));
    }
}
