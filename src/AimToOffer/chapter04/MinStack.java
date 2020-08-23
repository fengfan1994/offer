package AimToOffer.chapter04;

import java.util.Stack;

//问清题意，看能否使用辅助内存
public class MinStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void push(int i){
        if(stack1.empty()&& stack2.empty()){
            stack1.push(i);
            stack2.push(i);
        }
        if(i<=stack2.peek()){
            stack1.push(i);
            stack2.push(i);
        }else {
            stack1.push(i);
        }
    }

    public int getMinOfStack(){
        if(stack1.empty()&& stack2.empty()){
            throw  new RuntimeException("stack is rmpty");
        }
        return stack2.peek();
    }

    public int pop(){
        if(stack1.empty()&& stack2.empty()){
            throw  new RuntimeException("stack is rmpty");
        }
        int k=stack1.pop();
        if(k==getMinOfStack()){
            stack2.pop();
        }
        return k;
    }
}
