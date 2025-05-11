class LinkedList {
    node head;
    private int size;
    LinkedList() {
        this.size = 0;
    }
    class node {
        String name;
        node next;
        node(String name) {
            this.name = name;
            next = null;
        }
    }
    public void addFirst(String data) {
        size++;
        node newNode = new node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        size++;
        node newNode = new node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while(currNode.next != null) currNode = currNode.next;
        currNode.next = newNode;
    }
    public void printData() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.name + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        System.out.println("Deleted Value: " + head);
        head = head.next;
    }
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        node secondNode = head;
        node lasNode = head.next;
        while(lasNode.next != null) {
            lasNode = lasNode.next;
            secondNode = secondNode.next;
        }
        System.out.println("Deleted Value: " + lasNode.name);
        secondNode.next = null;
    }
    public int getSize() {
        return size;
    }
}
public class SlinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("20");
        list.addFirst("10");
        list.printData();
        list.getSize();
        list.addLast("30");
        list.addLast("40");
        list.printData();
        list.deleteFirst();
        list.printData();
        list.deleteLast();
        list.printData();
        list.getSize();
    }
}