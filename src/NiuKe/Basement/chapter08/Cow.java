package NiuKe.Basement.chapter08;
//计算一定月份后奶牛的数目
public class Cow {
    //基于递归
    public int getcowNumber(int n){
        if(n<1){
            return 0;
        }
        if(n==1 || n==2 || n==3){
            return n;
        }
        return getcowNumber(n-3)+getcowNumber(n-1);
    }


    //动态规划,空间复杂度O（1）
    public int getCowNumber(int n){
        if(n<1){
            return 0;
        }
        if(n==1 || n==2 || n==3){
            return n;
        }
        int[] result=new int[n+1];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        result[3]=3;
        for(int i=4;i<=n;i++){
            result[i]=result[i-3]+result[i-1];
        }
        return result[n];

    }
}
