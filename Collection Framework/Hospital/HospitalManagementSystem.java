import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Map<Integer, Patient> patientRecords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int patientIdCounter = 1;

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addPatient(patientRecords, patientIdCounter++, scanner);
                    break;
                case 2:
                    viewPatientDetails(patientRecords, scanner);
                    break;
                case 3:
                    searchPatientById(patientRecords, scanner);
                    break;
                case 4:
                    listAllPatients(patientRecords);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addPatient(Map<Integer, Patient> patientRecords, int patientId, Scanner scanner) {
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();

        Patient patient = new Patient(patientId, name, age);
        patientRecords.put(patientId, patient);
        System.out.println("Patient added successfully with ID " + patientId);
    }

    private static void viewPatientDetails(Map<Integer, Patient> patientRecords, Scanner scanner) {
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();

        Patient patient = patientRecords.get(patientId);
        if (patient != null) {
            System.out.println("Patient Details:");
            System.out.println(patient);
        } else {
            System.out.println("Patient not found.");
        }
    }

    private static void searchPatientById(Map<Integer, Patient> patientRecords, Scanner scanner) {
        System.out.print("Enter Patient ID to search: ");
        int searchId = scanner.nextInt();

        Patient patient = patientRecords.get(searchId);
        if (patient != null) {
            System.out.println("Patient found:");
            System.out.println(patient);
        } else {
            System.out.println("Patient with ID " + searchId + " not found.");
        }
    }

    private static void listAllPatients(Map<Integer, Patient> patientRecords) {
        if (patientRecords.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("List of Patients:");
            for (Patient patient : patientRecords.values()) {
                System.out.println(patient);
            }
        }
    }
}
