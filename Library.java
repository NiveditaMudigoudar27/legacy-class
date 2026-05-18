import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Date;
import java.util.Calendar;

public class Library {

    // Legacy Classes
    Vector<Book> books = new Vector<Book>();
    Hashtable<Integer, Book> issuedBooks = new Hashtable<Integer, Book>();
    Stack<Book> returnedBooks = new Stack<Book>();

    // Add Book
    public void addBook(Book b) {

        books.add(b);

        System.out.println("\nBook Added Successfully");
    }

    // Display All Books
    public void displayBooks() {

        if (books.isEmpty()) {

            System.out.println("\nNo Books Available");
            return;
        }

        Enumeration<Book> e = books.elements();

        while (e.hasMoreElements()) {

            Book b = e.nextElement();

            b.displayBook();
        }
    }

    // Search Book
    public void searchBook(int id) {

        Enumeration<Book> e = books.elements();

        while (e.hasMoreElements()) {

            Book b = e.nextElement();

            if (b.bookId == id) {

                System.out.println("\nBook Found");
                b.displayBook();
                return;
            }
        }

        System.out.println("\nBook Not Found");
    }

    // Issue Book
    public void issueBook(int id) {

        Enumeration<Book> e = books.elements();

        while (e.hasMoreElements()) {

            Book b = e.nextElement();

            if (b.bookId == id && b.issued == false) {

                b.issued = true;

                issuedBooks.put(id, b);

                Date d = new Date();

                System.out.println("\nBook Issued Successfully");
                System.out.println("Issue Date : " + d);

                return;
            }
        }

        System.out.println("\nBook Not Available");
    }

    // Return Book
    public void returnBook(int id) {

        Book b = issuedBooks.get(id);

        if (b != null) {

            b.issued = false;

            returnedBooks.push(b);

            issuedBooks.remove(id);

            Calendar c = Calendar.getInstance();

            System.out.println("\nBook Returned Successfully");
            System.out.println("Return Date : " + c.getTime());

        } else {

            System.out.println("\nThis Book Was Not Issued");
        }
    }
}