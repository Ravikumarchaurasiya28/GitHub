import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.size());
        list.add(1, 1);
        System.out.println(list);
        list.set(0, 9);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}