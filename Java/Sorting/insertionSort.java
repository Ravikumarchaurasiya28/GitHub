import java.util.*;

public class insertionSort {
    static void insertion_Sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        insertion_Sort(nums);
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}