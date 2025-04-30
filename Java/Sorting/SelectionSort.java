import java.util.*;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int idx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
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
        selectionSort(nums);
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}