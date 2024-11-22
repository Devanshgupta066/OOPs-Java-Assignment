import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        int quot, i = 1, j;
        int[] arr = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal number:");
        int dec_num = sc.nextInt();

        quot = dec_num;
        while (quot != 0) {
            arr[i++] = quot % 2;
            quot = quot / 2;
        }
        
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(arr[j]);
        }
        System.out.print("\n");
        sc.close();
    }
}
