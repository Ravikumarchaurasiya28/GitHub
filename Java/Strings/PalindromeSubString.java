package Strings;
import java.util.*;

public class PalindromeSubString {
    public static boolean Palindrome(String sb) {
        int i = 0, j = sb.length() - 1;
        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int cnt = 0;
        for(int i = 0; i < sb.length(); i++) {
            for(int j = i + 1; j <= sb.length(); j++) {
                if(Palindrome((String)sb.substring(i, j))) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
