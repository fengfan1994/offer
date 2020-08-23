package AimToOffer.chapter04;

import java.util.Stack;

public class BoolIsPopOrder {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,3,5,1,2};
        System.out.println(isPopOrder(a,b));
    }

    public static  boolean isPopOrder(int[] pushA,int[] popA) {
        if(popA==null || pushA==null){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
