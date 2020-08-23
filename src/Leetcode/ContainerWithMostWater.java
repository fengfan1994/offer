package Leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        if(height.length==0 || height==null){
            return 0;
        }
        int mostWater=0;
        int min=0;
        int tempResult=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                min=Math.min(height[i],height[j]);
                tempResult=min*(j-i);
                if(tempResult>mostWater){
                    mostWater=tempResult;
                }
            }
        }
        return mostWater;
    }

    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(nums));
    }
}
