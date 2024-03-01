package librarysystem;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    public void borrowItem() {
        borrowed = true;
    }

    public void returnItem() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}
