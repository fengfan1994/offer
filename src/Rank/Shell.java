package Rank;

public class Shell {
    public void sort(int[] a){
        int N=a.length;
        int h=1;
        while(h<N/3){
            h=3*h+1;
        }
        while(h>=1){
            //将数组变为h有序
            for(int i=h;i<N;i++){
                for(int j=i;j>=h && a[i]<a[j-h];j=j-h){
                    int temp=a[j-h];
                    a[j-h]=a[j];
                    a[j]=temp;
                }
            }
            h=h/3;
        }
    }
}
