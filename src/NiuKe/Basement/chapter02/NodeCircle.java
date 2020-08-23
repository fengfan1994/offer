package NiuKe.Basement.chapter02;
//一个环形链表，从1到n，每隔三个人有一个人自杀，求最后自杀的那个人
public class NodeCircle {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public Node LastNode(Node head,int m){
        if(head==null || head.next==null || m<1){
            return head;
        }
        Node last=head;
        //找到环形链表最后一个节点
        while(last.next!=head){
            last=last.next;
        }
        int count=0;
        while(head!=last){
            if(++count==m){
                last.next=head.next;
                count=0;
            }else{
                last=last.next;
            }
            head=last.next;
        }
        return head;
    }
}
