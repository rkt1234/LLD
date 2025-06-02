import java.util.*;

public class Member {
    private int id;
    private String name;
    private ArrayList<Book> issuedBooks;

    public Member(int id, String name, ArrayList<Book> issuedBooks) {
        this.id = id;
        this.name = name;
        this.issuedBooks = issuedBooks;
    }

    public int getId() {
        return id;
    }

    public void setIssuedBooks(ArrayList<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getIssuedBooks() {
        return issuedBooks;
    }
}
