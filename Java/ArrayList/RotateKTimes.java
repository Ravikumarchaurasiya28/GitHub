import java.util.Scanner;

public class RotateKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        RotateArray(list, k);
        System.out.println("After " + k + " Times Rotated Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
    private static void RotateArray(int[] list, int k) {
        k = k % list.length;
        reverse(list, 0, k - 1);
        reverse(list, k, list.length - 1);
        reverse(list, 0, list.length - 1);
    }
    private static void reverse(int[] list, int i, int j) {
        while(i < j) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++; j--;
        }
    }
}