public class q20 {
    public static void main(String[] args) {
        try {
            int[] negativeArray = new int[-5];
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}