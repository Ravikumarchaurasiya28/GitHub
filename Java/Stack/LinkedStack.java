package Java.Stack;

public class LinkedStack {
    static class node {
        int val;
        node next;
        node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    static class Stack {
        boolean isEmpty() {
            return head == null;
        }
        public static node head;
        void push(int data) {
            node newNode = new node(data);
            if(isEmpty()) {
                head = newNode;
            }
            node curr = head;
            while(curr.next != null) curr = curr.next;
            curr.val = data;
        }
        void pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
            }
            System.out.println("Deleted value: " + head.val);
            head = head.next;
        }
        void display() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
            }
            System.out.println("Top of Stack : ");
            System.out.println(head.val + " ");
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()) {
            s.pop();
        }
    }
}
