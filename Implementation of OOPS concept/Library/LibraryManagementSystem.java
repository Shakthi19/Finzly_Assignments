public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("One Indian Girl", 101, "Ragu");
        DVD dvd = new DVD("Refraction", 201, 50);

        book.displayInfo();
        System.out.println();
        dvd.displayInfo();
        System.out.println();

        LibraryMember student = new StudentMember(101, "Shakthi");
        LibraryMember faculty = new FacultyMember(501, "Sri");

        student.borrowItem(book);
        faculty.borrowItem(dvd);
    }
}
