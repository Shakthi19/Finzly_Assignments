// Base class LibraryItem
class LibraryItem {
    private String title;
    private int itemID;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
    }
}











