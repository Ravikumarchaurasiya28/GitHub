import java.util.*;

public class Bubble_Sorting {
    static void BubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        BubbleSort(nums);
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}