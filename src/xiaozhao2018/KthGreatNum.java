package xiaozhao2018;

import java.util.Arrays;

//两个数组相乘之后的第k大元素
public class KthGreatNum {
    int[] arr1={};
    int[] arr2={};

    public int getResult(int[] arr1,int[] arr2,int k){
        //从大到小排序
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n=arr1.length;
        int m=arr2.length;
        int l=arr1[n-1]*arr2[m-1];
        int r=arr1[0]*arr2[0];
        while(l<=r){
            int mid=(l+r)>>1;
            if(check(mid,n,m,k)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l-1;
    }

    public boolean check(int mid,int n,int m,int k){
        int cnt=0;
        for(int i=0;i<n;i++){
            int lt=0,rt=m-1;
            while(lt<=rt){
                int midt=(lt+rt)>>1;
                if(arr1[i]*arr2[midt]>=mid){
                    lt=midt+1;
                }else{
                    rt=midt-1;
                }
            }
            cnt+=lt;
        }
        return cnt>=k;
    }
}
