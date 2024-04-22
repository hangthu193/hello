import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {

    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        initializeEmployees();
        displayEmployees();
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add an employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addEmployee();
                    displayEmployees();
                    break;
                case 2:
                    removeEmployee();
                    displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void initializeEmployees() {
        employees.add(new Employee(1, "Nguyen Thi Thu Hang", 21, "IT", 123445, 10000000));
        employees.add(new Employee(2, "Nguyen Thu Minh", 22, "HR", 123456, 200000000));
        
        // Add more employees if needed
    }

    private static void displayEmployees() {
        System.out.println("\nEmployee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("\nEnter employee details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        int code = scanner.nextInt();
        System.out.print("Salary: ");
        long salaryrate = scanner.nextLong();

        employees.add(new Employee(id, name, age, department, code, salaryrate));
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee() {
        System.out.print("\nEnter the ID of the employee to remove: ");
        int id = scanner.nextInt();
        boolean removed = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }

    }   
}
