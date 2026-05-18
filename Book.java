public class Book {

    int bookId;
    String bookName;
    String author;
    boolean issued;

    // Constructor
    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.issued = false;
    }

    // Display Book Details
    public void displayBook() {

        System.out.println("\nBook ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Issued : " + issued);
    }
}