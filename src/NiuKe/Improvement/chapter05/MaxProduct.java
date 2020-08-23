package NiuKe.Improvement.chapter05;

public class MaxProduct {
    //数组中字数组的最大乘积
    public double getMaxProduct(int[] m){
        if(m==null || m.length==0){
            return 0;
        }
        double max=m[0];
        double min=m[0];
        double res=m[0];
        double maxEnd=0;
        double minEnd=0;
        for(int i=1;i<m.length;i++){
            maxEnd=max*m[i];
            minEnd=min*m[i];
            max=Math.max(Math.max(maxEnd,minEnd),m[i]);
            min=Math.min(Math.min(maxEnd,minEnd),m[i]);
            res=Math.max(max,min);
        }
        return res;
    }
}
