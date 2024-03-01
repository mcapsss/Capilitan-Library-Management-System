package librarysystem;

import java.util.ArrayList;

public abstract class LibraryUser {
    protected ArrayList<LibraryItem> itemsBorrowed = new ArrayList<>();

    public void borrowItem(LibraryItem item) {
        item.borrowItem();
        itemsBorrowed.add(item);
    }

    public void returnItem(LibraryItem item) {
        item.returnItem();
        itemsBorrowed.remove(item);
    }

    public abstract void printItemsBorrowed();
}

