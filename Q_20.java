import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        if (a == 0 || a == 1) {
            return;
        }
        for (int i = 2; i < a / 2; ++i) {
            if (a % i == 0) {
                System.out.println("Not a prime number");
                return;
            }

        }
        System.out.println("Prime Number");
        sc.close();
    }
}
