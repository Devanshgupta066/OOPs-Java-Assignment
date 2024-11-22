import java.util.Scanner;

public class Q_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num;
            }
        }

        System.out.println("The sum of all odd numbers in the array is: " + sum);

        sc.close();
    }
}
