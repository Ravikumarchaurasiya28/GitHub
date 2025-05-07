import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Power: " + pow(x, n));
    }
    static int pow(int x, int n) {
        if(n == 0) return 1;
        if(x == 0) return 0;
        if(n % 2 == 0) return pow(x, n / 2) * pow(x, n / 2);
        else return x * pow(x, n / 2) * pow(x, n / 2);
    }
}