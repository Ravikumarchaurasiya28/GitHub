import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'S', 'H', 'D'); 
    }

    static void towerOfHanoi(int n, char src, char help, char dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, help, src, dest);
    }
}