import java.util.Scanner;


class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


class Manager extends Employee {
    private String department;

    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

  
    public String getDepartment() {
        return department;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Hierarchy");
        System.out.print("Enter manager's name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter manager's ID: ");
        int managerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter manager's department: ");
        String managerDepartment = scanner.nextLine();
        System.out.print("Enter developer's name: ");
        String developerName = scanner.nextLine();
        System.out.print("Enter developer's ID: ");
        int developerId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter developer's primary programming language: ");
        String developerLanguage = scanner.nextLine();

        
        Manager manager = new Manager(managerId, managerName, managerDepartment);
        Developer developer = new Developer(developerId, developerName, developerLanguage);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("ID: " + developer.getId());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        scanner.close();
    }
}
