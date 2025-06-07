import java.util.*;

public class ValidNumber {
    public static void main(String[] args) {
        System.out.println(isvalidNumber("+917546385407"));
    }
    public static boolean isvalidNumber(String number) {
        return number.startsWith("+91") && number.length() == 13;
    }
}
