package Strings;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0, j = sb.length() - 1;
        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) {
                System.out.println("Not a Palindrome String");
                return;
            }
            i++; j--;
        }
        System.out.println("Palindrome String");
    }

}
