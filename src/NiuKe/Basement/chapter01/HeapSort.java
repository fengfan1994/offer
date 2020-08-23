package NiuKe.Basement.chapter01;

public class HeapSort {
    public static void heapSort(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }
        //根据数组构件大根堆
        for(int i=0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        int size=arr.length;
        //
        swap(arr,0,--size);
        while(size>0){
            heapify(arr,0,size);
            swap(arr,0,--size);
        }
    }

    //采用循环比较新插入节点与其父节点的大小
    public static void heapInsert(int[] arr,int index){
        while(arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void heapify(int[] arr,int index,int size){
        int left=index*2+1;
        while(left<size){
            //找出对应子节点中数值较大的那个子节点
            int largest=left+1<size && arr[left+1]>arr[left]?left+1:left;
            //比较当前节点的值与子节点最大的值，赋给largest变量
            largest=arr[largest]>arr[index]?largest:index;
            if(largest==index){
                break;
            }
            swap(arr,largest,index);
            index=largest;
            left=index*2+1;
        }
    }
}
