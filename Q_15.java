import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.print(i * n+" ");
            sc.close();
        }
    }
}