import java.util.*;

public class Fibonacci {
    static int fiboSeries(int n) {
        if(n == 1 || n == 2) return 1;
        else return fiboSeries(n - 1) + fiboSeries(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci value: " + fiboSeries(n));
    }
}