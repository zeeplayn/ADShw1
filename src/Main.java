import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1
        System.out.println(sumSquares(5)); // 55

        // 2
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr, arr.length)); // 10

        // 3
        System.out.println(powerSum(2, 5)); // 63

        // 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n, sc);
    }

    static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    static int powerSum(int b, int n) {
        if (n == 0) return 1;
        return (int)Math.pow(b, n) + powerSum(b, n - 1);
    }

    static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }
}