import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of km");
        int km = sc.nextInt();
        double miles = 0.612 * km;
        System.out.println("the value in miles is:");
        System.out.println(miles);
        sc.close();
    }

}
