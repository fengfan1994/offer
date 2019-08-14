package AimToOffer.chapter05;

public class ReversePairs {
    static int count=0;

    public static void main(String[] args) {
        int[] arr={1778759,2129338};
        ReversePairs.count=0;
        int[] temp=new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(count);
    }

    public  static void mergeArray(int[] arr,int first,int mid,int last,int[] temp){
        int i=first,j=mid+1;
        int m=mid,n=last;
        int k=0;
        while(i<=m && j<=n){
            if(arr[i]>arr[j]){
                temp[k++]=arr[j++];
                count=count+mid-i+1;
            }else{
                temp[k++]=arr[i++];
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=n){
            temp[k++]=arr[j++];
        }
        for(i=0;i<k;i++){
            arr[first+i]=temp[i];
        }
    }

    public static void mergeSort(int[] arr,int first,int last,int[] temp){
        if(first<last){
            int mid=(first+last)>>1;
            mergeSort(arr,first,mid,temp);
            mergeSort(arr,mid+1,last,temp);
            mergeArray(arr,first,mid,last,temp);
        }
    }
}
