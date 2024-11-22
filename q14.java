import java.util.Scanner; 

public class q14{
    private int emp_id; 						
    private String emp_name; 					
    private double basic_salary; 

    public q14(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id; 
        this.emp_name = emp_name; 
        this.basic_salary = basic_salary; 
    }

    public double calculateGrossSalary() {
        double hra = basic_salary * 0.10; 	
        double da = basic_salary * 0.05; 	
        return basic_salary + hra + da; 		
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id); 	
        System.out.println("Employee Name: " + emp_name); 	
        System.out.println("Basic Salary: " + basic_salary); 		
        System.out.println("Gross Salary: " + calculateGrossSalary());  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
   System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine(); 
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble(); 

        q14 employee = new q14(emp_id, emp_name, basic_salary);
        employee.displayDetails();
        
        scanner.close(); 
    }
}
