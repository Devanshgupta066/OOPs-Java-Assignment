public class q2{
    private String name;
    private int age;
    
    public q2() {
        this.name = "Akshar";
        this.age = 19;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        q2 example = new q2();
        example.displayInfo();
    }
}
