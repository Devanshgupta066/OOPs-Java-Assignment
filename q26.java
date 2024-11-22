import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class q26{
    private String name;
    private int age;

    public q26(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        try {
            int age = input.nextInt();
            q26 c = new q26(name, age);
            System.out.println("Candidate created successfully: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input for age. Please enter a valid integer.");
        }
    }
}
