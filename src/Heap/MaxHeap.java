package Heap;

import java.util.List;

/**
 * Create by zxb on 2017/9/10
 */
public interface MaxHeap<T extends Comparable<T>> {

    void display();

    void initOriginList(List<T> orginList);

    void makeHeap(int first, int last);

    void popHeap(int first, int last);

    void pushHeap(int first, int last);

    List<T> getHeap();
}
