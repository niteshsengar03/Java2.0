//Stack<Integer> stack = new Stack<Integer>();

import java.util.*;


class specialStack{
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public specialStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    public void  push(int x){
        stack.push(x);
        // first time to phela number push krna hi hoga 
        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }
    public int pop(){
        if(stack.isEmpty())
            return -1;
        int val = stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
        return val;
    }
    public int getMin(){
        if(minStack.isEmpty())
            return -1;
        return minStack.peek();
    }

}

public class StackMin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            specialStack sa = new specialStack();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                sa.push(val);
            }  
            System.out.println(sa.getMin());
            t--;
        }
    }
}
