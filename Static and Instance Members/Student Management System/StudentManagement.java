class Student {
    private int studentID;
    private String name;
    private static int totalStudents = 0;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        totalStudents++;
    }

    public void enrollStudent() {
        System.out.println(name + " enrolled.");
    }

    public void dropStudent() {
        System.out.println(name + " dropped.");
        totalStudents--;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Sri");
        Student student2 = new Student(2, "Shak");
        Student student3 = new Student(3, "Anu");

        System.out.println("Total students: " + Student.getTotalStudents());

        student1.enrollStudent();
        student2.enrollStudent();
        student3.enrollStudent();

        System.out.println("Total students: " + Student.getTotalStudents());

        student2.dropStudent();

        System.out.println("Total students: " + Student.getTotalStudents());
    }
}
