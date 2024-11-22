import java.util.Scanner;

public class Q_33 {
    public static class Commission {
        String name;
        int emp_no;
        int sal;
        double comm;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter employee name: ");
            name = sc.nextLine();
            System.out.print("Enter employee number: ");
            emp_no = sc.nextInt();
            System.out.print("Enter monthly sales value: ");
            sal = sc.nextInt();
        }

        void compute() {
            if (sal <= 50000) {
                comm = 5.0 / 100.0 * sal;
            } else if (sal <= 80000) {
                comm = 8.0 / 100.0 * sal;
            } else if (sal <= 100000) {
                comm = 10.0 / 100.0 * sal;
            } else if (sal < 0) {
                System.out.println("Invalid sales value.");
                comm = 0; // Handle invalid sales case
            } else {
                comm = 12.0 / 100.0 * sal;
            }
        }

        void display() {
            System.out.println("Employee name: " + name);
            System.out.println("Employee Number: " + emp_no);
            System.out.println("Monthly Sales: " + sal);
            System.out.println("Commission: " + comm);
        }

        public static void main(String[] args) { // Fixed: Made main static
            Commission obj = new Commission(); // Removed q133.Commission
            obj.input();
            obj.compute();
            obj.display();
        }
    }
}
