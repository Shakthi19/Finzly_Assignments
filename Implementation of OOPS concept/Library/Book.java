// Subclass Book
class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemID, String author) {
        super(title, itemID);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}
