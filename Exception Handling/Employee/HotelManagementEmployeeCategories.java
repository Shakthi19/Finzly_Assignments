import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
           }

    public int getEmployeeId() {
        return employeeId;
    
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name;
    }
}

class FrontDeskEmployee extends Employee {
	public FrontDeskEmployee(int employeeId, String name) {
        super(employeeId, name);
    }
	
	public void checkInGuests() {
        System.out.println(getName() + " is checking in guests.");
    }
	
	List<FrontDeskEmployee> frontDeskEmployees = new ArrayList<>();
	public void addEmployee(int employeeId, String name) {
        Employee e = new Employee(employeeId, name);
        frontDeskEmployees.add((FrontDeskEmployee) e);
    }
}

class HouseKeeping extends Employee {
	public HouseKeeping(int employeeId, String name) {
        super(employeeId, name);
    }
	public void cleanRoom() {
        System.out.println(getName() + " is cleaning a room.");
    }
	List<HouseKeeping> housekeepingEmployees = new ArrayList<>();
	public void addEmployee(int employeeId, String name) {
        Employee e = new Employee(employeeId, name);
        housekeepingEmployees.add((HouseKeeping) e);
}
}

class KitchenStaff extends Employee {
	public KitchenStaff(int employeeId, String name) {
        super(employeeId, name);
        }
	public void prepareFood() {
        System.out.println(getName() + " is preparing food.");
    }
	List<KitchenStaff> kitchenStaffEmployees = new ArrayList<>();
	public void addEmployee(int employeeId, String name) {
        Employee e = new Employee(employeeId, name);
        kitchenStaffEmployees.add((KitchenStaff) e);
    }
}

class Maintenance extends Employee {
		public Maintenance(int employeeId, String name) {
	        super(employeeId, name);
	    }
		public void chargeService() {
	        System.out.println(getName()+" is charging for Maintenance.");
	    }
		List<Maintenance> maintenanceEmployees = new ArrayList<>();
		public void addEmployee(int employeeId, String name) {
	        Employee e = new Employee(employeeId, name);
	        maintenanceEmployees.add((Maintenance) e);
	    }
	}
	
class EmployeeManagementSystem {
    private Map<String, List<Employee>> employeeCategories;

    public EmployeeManagementSystem() {
        employeeCategories = new HashMap<>();
    }

    public void hireEmployee(String category, int employeeId, String name) throws DuplicateEmployeeException {
        List<Employee> categoryEmployees = employeeCategories.getOrDefault(category, new ArrayList<>());
        for (Employee employee : categoryEmployees) {
            if (employee.getEmployeeId() == employeeId) {
            	throw new DuplicateEmployeeException("Employee with ID " + employeeId + " already exists in category " + category);    
            }
            
        }

        Employee newEmployee = new Employee(employeeId, name);
        categoryEmployees.add(newEmployee);
        employeeCategories.put(category, categoryEmployees);
        System.out.println("Employee hired successfully in category " + category);
    }

    public void fireEmployee(String category, int employeeId) {
        List<Employee> categoryEmployees = employeeCategories.get(category);
        if (categoryEmployees == null) {
            System.out.println("Category " + category + " does not exist.");
            return;
        }

        Employee employeeToRemove = null;
        for (Employee employee : categoryEmployees) {
            if (employee.getEmployeeId() == employeeId) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null) {
            categoryEmployees.remove(employeeToRemove);
            System.out.println("Employee with ID " + employeeId + " has been fired from category " + category);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found in category " + category);
        }
    }

    public void listEmployees(String category) {
        List<Employee> categoryEmployees = employeeCategories.get(category);
        if (categoryEmployees == null) {
            System.out.println("Category " + category + " does not exist.");
            return;
        }

        System.out.println("Employees in category " + category + ":");
        for (Employee employee : categoryEmployees) {
            System.out.println(employee);
        }
    }
}

class DuplicateEmployeeException extends Exception {
    public DuplicateEmployeeException(String message) {
        super(message);
    }
}



public class HotelManagementEmployeeCategories {

	public static void main(String[] args) throws DuplicateEmployeeException {
		// TODO Auto-generated method stub
			
		        EmployeeManagementSystem system = new EmployeeManagementSystem();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Hotel Management System Menu:");
		            System.out.println("1. Hire Employee");
		            System.out.println("2. List Employees");
		            System.out.println("3. Fire Employees");
		            System.out.println("4. FrontDesk Employees");
		            System.out.println("5. Kitchen Employees");
		            System.out.println("6. HouseKeeping Employees");
		            System.out.println("7. Maintenance Employees");
		            System.out.println("8. Exit");
		            System.out.print("Select an option: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine();  

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter employee category: ");
		                    String category = scanner.nextLine();
		                    System.out.print("Enter employee ID: ");
		                    int employeeId = scanner.nextInt();
		                    scanner.nextLine();  
		                    System.out.print("Enter employee name: ");
		                    String name = scanner.nextLine();

		                    try {
		                        system.hireEmployee(category, employeeId, name);
		                    } catch (DuplicateEmployeeException e) {
		                        System.out.println("Error: " + e.getMessage());
		                    }
		                    break;
		                case 2:
		                    System.out.print("Enter employee category: ");
		                    category = scanner.nextLine();
		                    system.listEmployees(category);
		                    break;
		                case 3:
		                	System.out.print("Enter employee category: ");
		                    category = scanner.nextLine();
		                    System.out.print("Enter employee Id: ");
		                    employeeId = scanner.nextInt();
		                    system.fireEmployee(category,employeeId);
		                    break;
		                case 4:
		    		        FrontDeskEmployee frontDeskEmployee = new FrontDeskEmployee(111, "Ram");
		    		        frontDeskEmployee.checkInGuests();
		                    break;
		                case 5:
		                	 HouseKeeping housekeepingEmployee = new HouseKeeping(222, "Sita");
		                	 housekeepingEmployee.cleanRoom();
		                    break;
		                case 6:
		                	KitchenStaff kitchenStaffEmployee = new KitchenStaff(333, "Narayan");
		    		        kitchenStaffEmployee.prepareFood();
		                    break;
		                case 7:
		                	Maintenance MaintanenceEmployee = new Maintenance(444, "Mayan");
		                	MaintanenceEmployee.chargeService();
		                    break;
		                case 8:
		                    System.out.println("Exiting Hotel Management System.");
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Please select a valid option.");
		            }

		                
		       
		        
		        
		    }}}
	