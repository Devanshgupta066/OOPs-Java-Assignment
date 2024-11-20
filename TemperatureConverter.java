import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Which way you wanna go: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
                break;

            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }

        scanner.close();
    }
}
