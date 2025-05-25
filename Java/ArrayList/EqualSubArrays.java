import java.util.Scanner;

public class EqualSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        if(EqualSubarray(list, n)) System.out.println("True");
        else System.out.println("False");
    }
    private static boolean EqualSubarray(int[] list, int n) {
        int[] preSum = new int[n];
        int totalSum = list[0];
        preSum[0] = list[0];
        for(int i = 1; i < n; i++) {
            preSum[i] += list[i];
            totalSum += list[i];
        }
        System.out.println(preSum[n - 1] + " " + totalSum);
        for(int i = 0; i < n; i++) {
            if(preSum[i] == (totalSum - preSum[i])) return true;
        }
        return false;
    }
}