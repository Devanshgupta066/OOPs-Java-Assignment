public class q15 {
    private String name;
    private int age;

        public q15(String name, int age) {
        this.name = name;        
        this.age = age;       
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        q15 p = new q15("John Doe", 30); 
        p.displayDetails(); 
    }
}
