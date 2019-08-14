package Rank;

public class Selection {
    //不断寻找最小的元素，排在数组的前端
    public  void sort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    public static void main(String[] args){
        int[] a={9,5,2,7,1,8,4,6,3};
        new Selection().sort(a);

    }

}
