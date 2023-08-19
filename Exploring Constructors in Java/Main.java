import java.util.Scanner;

class Student {
    private static int nextStudentId = 1; 
    private String name;
    private int age;
    private int studentId;

    public Student() {
        name = "Unknown";
        age = 0;
        studentId = nextStudentId++;
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentId = nextStudentId++;
    }

    
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Information System");

        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        Student defaultStudent = new Student();
        Student paramStudent = new Student(name, age);
        Student overloadedStudent = new Student(name, age, 2001); 
        System.out.println("\nStudent Details:");
        System.out.println("Default Student: Name - " + defaultStudent.getName() + ", Age - " + defaultStudent.getAge() + ", Student ID - " + defaultStudent.getStudentId());
        System.out.println("Parameterized Student: Name - " + paramStudent.getName() + ", Age - " + paramStudent.getAge() + ", Student ID - " + paramStudent.getStudentId());
        System.out.println("Overloaded Student: Name - " + overloadedStudent.getName() + ", Age - " + overloadedStudent.getAge() + ", Student ID - " + overloadedStudent.getStudentId());

        scanner.close();
    }
}
