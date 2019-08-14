package NiuKe.Improvement.chpater01;
//寻找数组中是否存在一个出现次数超过一半的数字，要求空间复杂度O（1），时间复杂度O（）
public class printHalfMajor {
    public  void getHalfMajor(int[] arr){
        int cand=0;
        int times=0;
        for(int i=0;i!=arr.length;i++){
            if(times==0){
                cand=arr[i];
            }else if(cand==arr[i]){
                times++;
            }else{
                times--;
            }
        }
        times=0;
        for(int i=0;i!=arr.length;i++){
            if(arr[i]==cand){
                times++;
            }
        }
        if(times>arr.length/2){
            System.out.println(cand);
        }else{
            System.out.println("No such number");
        }
    }
}
