package AimToOffer.chapter05;

public class MaxValue {
    public int getMaxValue(int[][] nums){
        int rows=nums.length;
        int columns=nums[0].length;
        int[][] maxValue=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                int up=0;
                int left=0;
                if(i>0){
                    up=maxValue[i-1][j];
                }
                if(j>0){
                    left=maxValue[i][j-1];
                }
                maxValue[i][j]=Math.max(up,left)+nums[i][j];
            }
        }
        return maxValue[rows-1][columns-1];
    }
}
