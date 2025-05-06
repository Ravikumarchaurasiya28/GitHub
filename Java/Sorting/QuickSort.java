import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for(int j = l; j < h; j++) {
            if(arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        i++;
        int t = arr[i];
        arr[i] = pivot;
        arr[h] = t;
        return i;
    }
    public static void quickSort(int[] arr, int l, int h) {
        if(l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        quickSort(nums, 0, n - 1);
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}