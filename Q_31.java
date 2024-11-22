public class Q_31 {
    int i;
    // constructor with no parameter
    private Q_31() {
    i = 5;
    System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
    // calling the constructor without any parameter
    Q_31 obj = new Q_31();
    System.out.println("Value of i: " + obj.i);
    }
   }
