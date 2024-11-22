import java.util.Arrays;
import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number of elements must be greater than zero.");
            return ;
        }

        double[] numbers = new double[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        // Sort the array
        Arrays.sort(numbers);

        double median;
        if (n % 2 == 0) {
            // Median for even number of elements
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            // Median for odd number of elements
            median = numbers[n / 2];
        }

        System.out.println("The median is: " + median);

        sc.close();
    }
}

