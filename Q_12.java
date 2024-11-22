import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Enter marks in Mathematics: ");
            int math = sc.nextInt();
            System.out.print("Enter marks in Physics: ");
            int physics = sc.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            int chemistry = sc.nextInt();

            if (math >= 60 && physics >= 50 && chemistry >= 40 &&
                    (math + physics + chemistry >= 200 || math + physics >= 150)) {
                System.out.println("Eligible for admission.");
            } else {
                System.out.println("Not eligible for admission.");
            }
        }

        sc.close();
    }
}
