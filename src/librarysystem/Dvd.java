package librarysystem;

public class Dvd implements LibraryItem {
    private String title;
    private String director;
    private int runningTime;
    private boolean borrowed;

    public Dvd(String title, String director, int runningTime) {
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
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
        return "DVD: " + title + " directed by " + director;
    }
}

