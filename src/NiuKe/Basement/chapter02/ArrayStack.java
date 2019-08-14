package NiuKe.Basement.chapter02;
//用数组表示一个栈
public class ArrayStack {
    private Integer[] arr;
    private Integer size;
    public ArrayStack(int initSize){
        if(initSize<0){
            throw new IllegalArgumentException("the initSize less than 0");
        }
        arr=new Integer[initSize];
        size=0;
    }

    public Integer peek(){
        if(size==0){
            return null;
        }
        return arr[size-1];
    }

    public void push(int n){
        if(size==arr.length){
            throw new ArrayIndexOutOfBoundsException("the queue is full");
        }
        arr[size++]=n;
    }

    public Integer pop(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }
        return arr[--size];

    }
}
