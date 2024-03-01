package librarysystem;

public class Teacher extends LibraryUser {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void printItemsBorrowed() {
        System.out.println("Teacher: " + name);
        System.out.println("Borrowed Items: ");
        for (LibraryItem item : itemsBorrowed) {
            System.out.println("- " + item.toString());
        }
    }
}
