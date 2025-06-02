import java.util.*;
public class Library {
    private ArrayList<Book> bookList; // aggregation between Library and Book 
    private ArrayList<Member> memberList; // aggregation between Library and Member

    void addMember(Member member) {
        memberList.add(member);
    }

    void addBook(Book book) {
        bookList.add(book);
    }

    void issueBook(Member member, Book book) {
        if(member.getIssuedBooks().size() == 3)
        System.out.println("Sorry cannot issue book you already have 3");
        else {
            ArrayList<Book> memberBookList = member.getIssuedBooks();
            memberBookList.add(book);
            member.setIssuedBooks(memberBookList);
        }
    }

    void receiveBook(Member member, Book book) {
        ArrayList<Book> memberBookList = member.getIssuedBooks();
        memberBookList.remove(book);
        member.setIssuedBooks(memberBookList);
    }

    public static void main(String args[]) {
        // Initialize Library
        Library library = new Library();
        library.bookList = new ArrayList<>();
        library.memberList = new ArrayList<>();

        // Create Books
        Book book1 = new Book(101, "The Alchemist", "Paulo Coelho", true);
        Book book2 = new Book(102, "1984", "George Orwell", true);
        Book book3 = new Book(103, "To Kill a Mockingbird", "Harper Lee", true);
        Book book4 = new Book(104, "Brave New World", "Aldous Huxley", true);

        // Add Books to Library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Create Member
        Member member1 = new Member(1, "Ravi", new ArrayList<>());

        // Add Member to Library
        library.addMember(member1);

        // Issue 3 books
        library.issueBook(member1, book1);
        library.issueBook(member1, book2);
        library.issueBook(member1, book3);

        // Try to issue 4th book — should fail due to 3-book limit
        library.issueBook(member1, book4);

        // Display all issued books
        System.out.println("\nBooks issued to " + member1.getName() + ":");
        for (Book b : member1.getIssuedBooks()) {
            System.out.println("- " + b.getTitle() + " by " + b.getAuthor());
        }

        // Return one book
        library.receiveBook(member1, book2);

        // Try issuing 4th book again — should succeed now
        library.issueBook(member1, book4);

        // Final issued books list
        System.out.println("\nFinal books issued to " + member1.getName() + ":");
        for (Book b : member1.getIssuedBooks()) {
            System.out.println("- " + b.getTitle() + " by " + b.getAuthor());
        }
    }    

}