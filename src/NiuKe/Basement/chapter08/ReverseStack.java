package NiuKe.Basement.chapter08;

import java.util.Stack;

//基于递归反转一个栈的内容，不允许使用辅助内存
public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i=getAndRemoveLastElement(stack);
        reverse(stack);
        System.out.print(i+" ");
        stack.push(i);
    }

    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
            int last=getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> test = new Stack<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        reverse(test);


    }
}
