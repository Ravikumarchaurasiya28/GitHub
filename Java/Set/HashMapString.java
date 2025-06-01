import java.util.*;

public class HashMapString {
    public static void main(String[] args) {
//        Map m = new HashMap();
//        String str = "Hello i am learning Java";
//        for(char c : str.toCharArray()) {
//            if(m.containsKey(c)) {
//                int old = (int) m.get(c);
//                m.put(old, old + 1);
//            } else {
//                m.put(c, 1);
//            }
//        }
//        m.remove(' ');
//        System.out.println(m);
//        //System.out.println(str.toCharArray());
        int[] list = {-9, 45, 22, 45, 46, 12, 54}; // For Sorting into a range
        Arrays.sort(list, 1, list.length);
        for(int i : list) System.out.print(i + " ");
    }
}