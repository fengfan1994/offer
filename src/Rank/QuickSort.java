package Rank;

public class QuickSort {
    public static void sort(int[] a){
        sort(a,0,a.length-1);
    }

    //将数组切分为两个子数组，分别排序
    public static void sort(int[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int j=partion(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    /*切分函数，将数组切分为两部分，左端都比选择数小，
     右端都比选择数大，这里以数组的第一个元素作为切分点，将数组分为两个部分*/
    private static int partion(int[] a,int lo,int hi){
        int i=lo,j=hi+1;
        int v=a[lo];
        //从左开始扫描大于切分点元素，从右开始扫描小于切分点元素，将找到的元素交换位置
        while (true){
            while(a[++i]<v){
                if(i==hi){
                    break;
                }
            }
            while(v<=a[--j]){
                if(j==lo){
                    break;
                }
            }
            if(i>=j){
                break;
            }
            swap(a,i,j);
        }
        //将切分标准元素放入正确的位置
        swap(a,lo,j);
        return j;

    }

    public static void swap(int[] m,int i,int j){
        int temp=m[j];
        m[j]=m[i];
        m[i]=temp;
    }

    public static void main(String[] args) {
        int[] a={9,5,2,7,1,8,4,6,3};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
