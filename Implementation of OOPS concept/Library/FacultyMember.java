// Subclass FacultyMember
class FacultyMember extends LibraryMember {
    public FacultyMember(int memberID, String name) {
        super(memberID, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println(getName() + " (Faculty) is borrowing: " + item.getTitle());
    }
}