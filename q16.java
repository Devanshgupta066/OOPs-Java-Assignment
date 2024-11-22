public class q16 {
    static int count = 0; 
    
    public q16() { 
        count++;
    }
    public static void displayCount() { 
        System.out.println("Count of objects created: " + count);
    }

    public static void main(String[] args) {
        q16 obj1 = new q16();
        q16 obj2 = new q16();
        
        q16.displayCount(); 
    }
}

