package ImplementQueueUsingStack;

import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    public void push(int x) {
        if(!s2.empty()){
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }
        s1.push(x);
    }

    public int pop() {
        if(!s1.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }else{
            if(!s2.empty()){
                return s2.pop();
            }else
                return 0;
        }


    }

    public int peek() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        return s2.peek();

    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
