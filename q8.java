class Parent {
    public static void display() {
        System.out.println("Static method in Parent class");
    }
    public void show() {
        System.out.println("Non-static method in Parent class");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child class");
    }
    @Override
    public void show() {
        System.out.println("Non-static method in Child class");
    }
}

public class q8{
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent.display();  
        parent.show();    

        Child child = new Child();
        Child.display();  
        child.show();      
        
        Parent parentRefChild = new Child();
        Parent.display(); 
        parentRefChild.show();    
    }
}
