import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimensions of Matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix1 = new int[r][c];
        System.out.println("Enter 1st Matrix elements: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[r][c];
        System.out.println("Enter 2nd Matrix elements: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] Sum = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                Sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of Given Matrix is: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}