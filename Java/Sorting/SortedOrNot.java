import java.util.*;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Result: " + SortedArr(arr));
    }
    public static boolean SortedArr(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}