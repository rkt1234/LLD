public class Book {
    private int isbn;
    private String title;
    private String author;
    private boolean availabilityStatus;

    public Book(int isbn, String title, String author, boolean availabilityStatus) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

}
