public class q3 {
    private String name;
    private int age;

    public q3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        q3 example = new q3("Alice", 25);
        example.displayInfo();
    }
}
