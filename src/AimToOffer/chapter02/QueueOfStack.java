package AimToOffer.chapter02;

import java.util.Stack;

//用栈来表示队列
public class QueueOfStack<T> {
    private Stack<T> stack1;

    private Stack<T> stack2;

    public void push(T k){
        stack1.push(k);
    }

    public T delete(){
        if(stack2.size()<=0){
            while(stack1.size()>0){
                T data=stack1.pop();
                stack2.push(data);
            }
        }
        if(stack2.size()==0){
            System.out.println("queue is empty");
        }
        T head=stack2.pop();
        return head;
    }
}
