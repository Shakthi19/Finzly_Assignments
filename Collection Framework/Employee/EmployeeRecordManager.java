import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeRecordManager {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Record Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(employeeList, scanner);
                    break;
                case 2:
                    viewAllEmployees(employeeList);
                    break;
                case 3:
                    searchEmployeeById(employeeList, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addEmployee(List<Employee> employeeList, Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, salary);
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    private static void viewAllEmployees(List<Employee> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("List of Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    private static void searchEmployeeById(List<Employee> employeeList, Scanner scanner) {
        System.out.print("Enter Employee ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.getId() == searchId) {
                System.out.println("Employee found:");
                System.out.println(employee);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
