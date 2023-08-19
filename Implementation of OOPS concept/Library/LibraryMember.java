// Abstract class LibraryMember
abstract class LibraryMember {
    private int memberID;
    private String name;

    public LibraryMember(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public abstract void borrowItem(LibraryItem item);

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }
}