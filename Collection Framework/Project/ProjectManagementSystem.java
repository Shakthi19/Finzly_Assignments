import java.util.*;

class TeamMember {
    private String memberId;
    private String name;

    public TeamMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }
}

class Project {
    private String projectId;
    private String projectName;
    private Set<TeamMember> teamMembers;

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

    @Override
    public String toString() {
        return "Project ID: " + projectId + ", Project Name: " + projectName;
    }
}

public class ProjectManagementSystem {
    public static void main(String[] args) {
        Map<String, Project> projects = new HashMap<>();
        Set<TeamMember> teamMembers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProject Management System");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member to Project");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addProject(projects, scanner);
                    break;
                case 2:
                    assignTeamMemberToProject(projects, teamMembers, scanner);
                    break;
                case 3:
                    viewProjectDetails(projects, scanner);
                    break;
                case 4:
                    listAllProjects(projects);
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

    private static void addProject(Map<String, Project> projects, Scanner scanner) {
        System.out.print("Enter Project ID: ");
        String projectId = scanner.nextLine();
        System.out.print("Enter Project Name: ");
        String projectName = scanner.nextLine();

        Project project = new Project(projectId, projectName);
        projects.put(projectId, project);
        System.out.println("Project added successfully.");
    }

    private static void assignTeamMemberToProject(Map<String, Project> projects, Set<TeamMember> teamMembers, Scanner scanner) {
        System.out.print("Enter Project ID: ");
        String projectId = scanner.nextLine();
        Project project = projects.get(projectId);

        if (project != null) {
            System.out.print("Enter Member ID: ");
            String memberId = scanner.nextLine();
            System.out.print("Enter Member Name: ");
            String memberName = scanner.nextLine();

            TeamMember teamMember = new TeamMember(memberId, memberName);
            teamMembers.add(teamMember);
            project.addTeamMember(teamMember);
            System.out.println("Team member assigned to the project.");
        } else {
            System.out.println("Project not found.");
        }
    }

    private static void viewProjectDetails(Map<String, Project> projects, Scanner scanner) {
        System.out.print("Enter Project ID: ");
        String projectId = scanner.nextLine();
        Project project = projects.get(projectId);

        if (project != null) {
            System.out.println("Project Details:");
            System.out.println(project);
            System.out.println("Team Members:");
            for (TeamMember member : project.getTeamMembers()) {
                System.out.println(member);
            }
        } else {
            System.out.println("Project not found.");
        }
    }

    private static void listAllProjects(Map<String, Project> projects) {
        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            System.out.println("List of Projects:");
            for (Project project : projects.values()) {
                System.out.println(project);
            }
        }
    }
}
