package librarysystem;

public class Student extends LibraryUser {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printItemsBorrowed() {
        System.out.println("Student: " + name);
        System.out.println("Borrowed Items: ");
        for (LibraryItem item : itemsBorrowed) {
            System.out.println("- " + item.toString());
        }
    }
}
