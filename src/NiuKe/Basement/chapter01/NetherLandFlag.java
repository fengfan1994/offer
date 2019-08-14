package NiuKe.Basement.chapter01;
//荷兰国旗问题，基于快速排序原理
public class NetherLandFlag {
    //将数组下标l从到p的数据进行排序,大于p的放在右侧，小于p的放在左侧，等于p的放在中间
    public static int[] partion(int[] arr,int l,int r,int p){
        int less=l-1;
        int more=r+1;
        while (l<more){
            if(arr[l]<p){
                swap(arr,++less,l++);
            }else if(arr[l]>p){
                swap(arr,--more,l);
            }else {
                l++;
            }
        }
        return new int[]{less+1,more-1};
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
