class Animal {
    public void display() {
        System.out.println("This is an animal.");
    }
}

class Mammal extends Animal {
    public void display() {
        super.display(); 
        System.out.println("This is a mammal.");
    }
}

class Dog extends Mammal {
    public void display() {
        super.display(); 
        System.out.println("This is a dog.");
    }
}

public class q13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.display();
    }
}
