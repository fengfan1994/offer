package NiuKe.Improvement.chapter05;

public class SubMatrixMaxSum {
    public int getMax(int[][] arr){
        if(arr==null || arr.length==0 || arr[0].length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int cur=0;
        int[] s=null;
        for(int i=0;i<arr.length;i++){
            s=new int[arr[0].length];
            for(int j=i;j<arr.length;j++){
                cur=0;
                for(int k=0;k<s.length;k++){
                    s[k]+=arr[j][k];
                    cur+=s[k];
                    max=Math.max(max,cur);
                    cur=cur<0?0:cur;
                }
            }
        }
        return max;
    }
}
