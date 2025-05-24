import java.util.Scanner;

public class SquareSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Sorted Array elements: ");
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        SquareArray(list);
        System.out.println("After Square Array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
    private static void SquareArray(int[] list) {
        int[] sqr = new int[list.length];
        int i = 0, j = list.length - 1, k = 0;
        while(i <= j) {
            if(Math.abs(list[i]) > Math.abs(list[j])){
                sqr[k++] = list[i] * list[i];
                i++;
            }
            else if(Math.abs(list[i]) < Math.abs(list[j])) {
                sqr[k++] = list[j] * list[j];
                j--;
            }
            else {
                sqr[k++] = list[i] * list[j];
                i++; j--;
            }
        }
        for(int l = 0; l < list.length; l++) {
            list[l] = sqr[l];
        }
    }
}