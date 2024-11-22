import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage");
        int percent = sc.nextInt();
        if (percent >= 90)
            System.out.println("Grade A");
        else if (percent >= 80)
            System.out.println("Grade B");
        else if (percent >= 70)
            System.out.println("Grade C");
        else if (percent >= 60)
            System.out.println("Grade D");
        else if (percent >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
        sc.close();
    }

}
