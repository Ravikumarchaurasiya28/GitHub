import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimensions of 1st Matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter Dimensions of 2nd Matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1 != r2) {
            System.out.println("Multiplication is not Possible.");
            return;
        }
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter 1st Matrix elements: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter 2nd Matrix elements: ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] Res = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    Res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication of Given Matrix is: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.print(Res[i][j] + " ");
            }
            System.out.println();
        }
    }
}