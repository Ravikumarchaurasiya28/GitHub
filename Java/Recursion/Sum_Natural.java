import java.util.*;

public class Sum_Natural {
    static int recSum(int n) {
        if(n == 1) return 1;
        else return n + recSum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + recSum(n));
    }
}