package Java.Stack;
import java.util.*;

public class ArrayStack {
    public static class Stack {
        List<Integer> list = new ArrayList<> ();
        boolean isEmpty() {
            return list.size() == 0;
        }
        void push(int data) {
            list.add(data);
        }
        int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        int peek() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
