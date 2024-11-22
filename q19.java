public class q19 {
    public static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("Division by zero is not allowed"); 
    }

    public static void main(String[] args) {
        try {
            riskyMethod(); 
        } 
        catch (ArithmeticException e) {
         
            System.out.println("Caught an exception: " + e.getMessage());
        } 
        finally {
            
            System.out.println("This is the finally block. It always executes.");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
     
            System.out.println("Caught an exception: " + e.getMessage());
        } 
        finally {

            System.out.println("This is the finally block. It always executes.");
        }
    }
}

