import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.next();

        int sum = 0;
        
        for (int i = 0; i < input.length() - 1; i++) {  
            String consecutiveDigits = input.substring(i, i + 2);  
            sum += Integer.parseInt(consecutiveDigits); 
        }

        System.out.println("Sum of consecutive digits numbers: " + sum);
        scanner.close(); 
    }
}

