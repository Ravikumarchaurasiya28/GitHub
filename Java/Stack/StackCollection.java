package Java.Stack;
import java.util.*;

public class StackCollection {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }
    public static void pushAtBottom(Stack<Integer> st, int data) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<> ();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //pushAtBottom(st, 50);
        reverseStack(st);
        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
