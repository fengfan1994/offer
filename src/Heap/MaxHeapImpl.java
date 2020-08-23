package Heap;

import java.util.ArrayList;
import java.util.List;


public class MaxHeapImpl<T extends Comparable<T>> implements MaxHeap<T> {

    private List<T> heap;

    private List<T> orginList;

    public void initOriginList(List<T> orginList) {
        this.orginList = orginList;
    }

    public List<T> getHeap() {
        return heap;
    }

    public MaxHeapImpl() {
        this.heap = new ArrayList<>();
    }

    /**
     * 插入对应上浮
     *
     * @param start
     */
    protected void adjustUp(int start) {
        int currentIndex = start;
        int parentIndex = (currentIndex - 1) / 2;
        T tmp = heap.get(currentIndex);
        while (currentIndex > 0) {
            int cmp = heap.get(parentIndex).compareTo(tmp);
            if (cmp >= 0) {
                break;
            } else {
                heap.set(currentIndex, heap.get(parentIndex));
                currentIndex = parentIndex;
                parentIndex = (parentIndex - 1) / 2;
            }
        }
        heap.set(currentIndex, tmp);
    }

    public void insert(T data) {
        int size = heap.size();
        heap.add(data);    // 将"数组"插在表尾
        adjustUp(size);        // 向上调整堆
    }

    public void remove(int index) {
        int size = heap.size();
        heap.set(index, heap.get(size - 1));
        heap.remove(size - 1);
        adjustDown(index);
    }

    /**
     * 删除对应下沉
     *
     * @param index
     */
    private void adjustDown(int index) {
        int currentIndex = index;
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;
        T tmp = heap.get(currentIndex);
        int size = heap.size();
        while (leftChildIndex < size) {
            T left = null;
            T right = null;
            if (leftChildIndex < size) {
                left = heap.get(leftChildIndex);
            }
            if (rightChildIndex < size) {
                right = heap.get(rightChildIndex);
            }
            int maxIndex = right == null ? leftChildIndex : (left.compareTo(right) >= 0 ? leftChildIndex : rightChildIndex);
            T max = heap.get(maxIndex);
            if(tmp.compareTo(max)>=0){
                break;
            }else{
                heap.set(currentIndex, max);
                heap.set(maxIndex, tmp);
                leftChildIndex = maxIndex * 2 +1;
                rightChildIndex = maxIndex +1;
            }
        }
    }

    public void makeHeap(int first, int last) {
        for (int i = first; i < last; i++) {
            insert(orginList.get(i));
        }
    }

    public void popHeap(int first, int last) {
        remove(first);
    }

    public void pushHeap(int first, int last) {
        adjustUp(last - 1);
    }

    public void display() {
        System.out.println(heap);
    }


}
