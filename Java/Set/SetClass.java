import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<Integer> ();
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(4);
        System.out.println(s);
    }
}