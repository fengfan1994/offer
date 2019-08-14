package NiuKe.Basement.chapter02;
//给定一个数值，将节点分为小于、等于和大于目标值的三部分
public class NodeSort {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    //不需要保持节点的相对顺序
    public static Node listPartition1(Node head,int pivot){
        if(head==null){
            return head;
        }
        Node cur=head;
        int i=0;
        while(cur!=null){
            i++;
            cur=cur.next;
        }
        Node[] nodeArr=new Node[i];
        i=0;
        cur=head;
        for( i=0;i<nodeArr.length;i++){
            nodeArr[i]=cur;
            cur=cur.next;
        }
        arrPartition(nodeArr,pivot);
        for(i=1;i!=nodeArr.length;i++){
            nodeArr[i-1].next=nodeArr[i];
        }
        nodeArr[i-1].next=null;
        return nodeArr[0];
    }

    //节点形式的荷兰国旗问题
    public static void arrPartition(Node[] nodeArr,int pivot){
        int small=-1;
        int big=nodeArr.length;
        int index=0;
        while(index!=big){
            if(nodeArr[index].value<pivot){
                swap(nodeArr,++small,index++);
            }else if(nodeArr[index].value==pivot){
                index++;
            }else{
                swap(nodeArr,--big,index);
            }
        }
    }

    public static void swap(Node[] nodeArr, int a, int b) {
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;
    }

    //保持节点的相对顺序
    public static Node listPartition2(Node head,int pivot) {
        Node sH = null; // small head
        Node sT = null; // small tail
        Node eH = null; // equal head
        Node eT = null; // equal tail
        Node bH = null; // big head
        Node bT = null; // big tail
        Node next = null; // save next node
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.value < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else {
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
            head = next;
        }
        if (sT != null) {
            sT.next = eH;
            eT = eT == null ? sT : eT;
        }
        if (eT != null) {
            eT.next = bH;
        }
        return sH != null ? sH : eH != null ? eH : bH;
    }
}
