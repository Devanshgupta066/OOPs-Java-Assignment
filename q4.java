public class q4 {
        private String name;
        private int age;

        public q4() {
            this.name = "Unknown";
            this.age = 0;
            System.out.println("No-argument constructor called");
        }

        public q4(String name) {
            this.name = name;
            this.age = 0;
            System.out.println("Constructor with name parameter called");
        }

        public q4(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Constructor with name and age parameters called");
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    
        public static void main(String[] args) {
            q4 person1 = new q4();
            person1.displayInfo();

            q4 person2 = new q4("Alice");
            person2.displayInfo();

            q4 person3 = new q4("Bob", 25);
            person3.displayInfo();
        }
    }
    

