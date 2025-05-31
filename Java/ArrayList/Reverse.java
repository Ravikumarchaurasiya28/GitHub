import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        reverse(list);
        System.out.println(list);
    }
    private static void reverse(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while(i <= j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }
}