import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Sorted Array elements: ");
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++) {
            list[i] += list[i - 1];
        }
        System.out.println("After Prefix Sum Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}