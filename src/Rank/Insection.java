package Rank;

public class Insection {
    //假定数组前端已排序，将未排序的第一个元素插入到已排序数组的对应位置
    public void sort(int[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
        }
    }

    public static void main(String[] args){
        int[] a={9,5,2,7,1,8,4,6,3};
        new Insection().sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
