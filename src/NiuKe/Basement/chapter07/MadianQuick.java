package NiuKe.Basement.chapter07;

import java.util.Comparator;
import java.util.PriorityQueue;

//得到数据流中的中位数
//构造两个堆，一个最大堆，一个最小堆
public class MadianQuick {
    public static class MedianHolder{
        private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new MaxHeapComparator());
        private PriorityQueue<Integer> minHeap=new PriorityQueue<>(new MinHeapComparator());

        static class MaxHeapComparator implements Comparator<Integer>{

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }

        static class MinHeapComparator implements Comparator<Integer>{

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }

        private void modifyHeapSize(){
            if(this.maxHeap.size()==this.minHeap.size()+2){
                this.minHeap.add(this.maxHeap.poll());
            }
            if(this.maxHeap.size()==this.minHeap.size()-2){
                this.maxHeap.add(this.minHeap.poll());
            }
        }

        public void addNum(int num){
            if(this.maxHeap.isEmpty()){
                this.maxHeap.add(num);
                return;
            }
            if(this.maxHeap.peek()>=num){
                this.maxHeap.add(num);
            }else{
                if (this.minHeap.isEmpty()) {
                    this.minHeap.add(num);
                    return;
                }
                if (this.minHeap.peek() > num) {
                    this.maxHeap.add(num);
                } else {
                    this.minHeap.add(num);
                }
            }
            modifyHeapSize();
        }

        public Integer getMedian() {
            int maxHeapSize = this.maxHeap.size();
            int minHeapSize = this.minHeap.size();
            if (maxHeapSize + minHeapSize == 0) {
                return null;
            }
            Integer maxHeapHead = this.maxHeap.peek();
            Integer minHeapHead = this.minHeap.peek();
            if (((maxHeapSize + minHeapSize) & 1) == 0) {
                return (maxHeapHead + minHeapHead) / 2;
            }
            return maxHeapSize > minHeapSize ? maxHeapHead : minHeapHead;
        }
    }


}
