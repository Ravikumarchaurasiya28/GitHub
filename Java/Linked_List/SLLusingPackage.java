import java.util.*;

public class SLLusingPackage {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("20");
        list.addFirst("10");
        System.out.println(list);
        list.add("30");
        list.add("40");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        if (list.size() > 2) {
            list.remove(2);
            System.out.println(list);
        } else {
            System.out.println("Not enough elements to remove at index 2.");
        }
    }
}
