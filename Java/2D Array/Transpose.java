import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimensions of Matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] Res = new int[c][r];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                Res[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(Res[i][j] + " ");
            }
            System.out.println();
        }
    }
}