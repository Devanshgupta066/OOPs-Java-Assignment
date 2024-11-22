
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        // to check whether a given number is divisble by given number or not
        if (a % a == 0) {
            System.out.println("the nmumber is divisible");
        } else if (a % a != 0) {
            System.out.println("the number is not divisible ");
        } else {
            System.out.println("the number is not divisible");
            sc.close();
        }
    }
}
