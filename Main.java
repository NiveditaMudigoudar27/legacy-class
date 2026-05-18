import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library();

        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("\nEnter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    Book b = new Book(id, name, author);

                    lib.addBook(b);

                    break;

                case 2:

                    lib.displayBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID To Search : ");
                    int sid = sc.nextInt();

                    lib.searchBook(sid);

                    break;

                case 4:

                    System.out.print("Enter Book ID To Issue : ");
                    int iid = sc.nextInt();

                    lib.issueBook(iid);

                    break;

                case 5:

                    System.out.print("Enter Book ID To Return : ");
                    int rid = sc.nextInt();

                    lib.returnBook(rid);

                    break;

                case 6:

                    System.out.println("\nThank You...");
                    break;

                default:

                    System.out.println("\nInvalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}