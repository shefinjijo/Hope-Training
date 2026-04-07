class LibraryItem {
    String title;
    int id;

    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", ID: " + id);
    }
}

class Book extends LibraryItem {
    String author;

    Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    void showBook() {
        displayInfo();
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String title, int id, String author, double fileSize) {
        super(title, id, author);
        this.fileSize = fileSize;
    }

    void showEBook() {
        showBook();
        System.out.println("File Size: " + fileSize + "MB");
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String title, int id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    void showMagazine() {
        displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}

class Borrower extends LibraryItem {
    String borrowerName;

    Borrower(String title, int id, String borrowerName) {
        super(title, id);
        this.borrowerName = borrowerName;
    }

    void borrowItem() {
        System.out.println(borrowerName + " borrowed " + title);
    }
}

class PremiumBorrower extends Borrower {
    int limit;

    PremiumBorrower(String title, int id, String borrowerName, int limit) {
        super(title, id, borrowerName);
        this.limit = limit;
    }

    void showDetails() {
        borrowItem();
        System.out.println("Borrow Limit: " + limit);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", 101, "James Gosling");
        b.showBook();

        System.out.println("----------------");

        EBook eb = new EBook("Advanced Java", 102, "Oracle", 5.5);
        eb.showEBook();

        System.out.println("----------------");

        Magazine m = new Magazine("Tech Monthly", 103, 12);
        m.showMagazine();

        System.out.println("----------------");

        Borrower br = new Borrower("Java Basics", 101, "Steve");
        br.borrowItem();

        System.out.println("----------------");

        PremiumBorrower p = new PremiumBorrower("Advanced Java", 102, "Steve", 5);
        p.showDetails();
    }
}