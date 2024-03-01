package librarysystem;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Dvd dvd1 = new Dvd("The Shawshank Redemption", "Frank Darabont", 142);

        Student studentAlice = new Student("Alice");
        Teacher teacherBob = new Teacher("Bob");

        studentAlice.borrowItem(book1);
        teacherBob.borrowItem(dvd1);

        studentAlice.printItemsBorrowed();
        teacherBob.printItemsBorrowed();

        studentAlice.returnItem(book1);
        teacherBob.returnItem(dvd1);

        studentAlice.printItemsBorrowed();
        teacherBob.printItemsBorrowed();
    }
}
