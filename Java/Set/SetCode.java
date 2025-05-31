import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class SetCode {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<> (); // unordered set
        //Set<Integer> st = new TreeSet<> (); // ordered set
        //Set<Integer> st = new LinkedHashSet<> (); //values as insertion
        st.add(1);
        st.add(2);
        st.add(1);
        st.add(4);
        st.add(2);
        st.add(-9);
        st.add(3);
        st.remove(1);
        st.remove(9);
        System.out.println(st);
        System.out.println(st.contains(9));
    }
}