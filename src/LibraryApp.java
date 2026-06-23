import java.util.Scanner;

public class LibraryApp
{
    private Library library;
    private Scanner in;
    private final int EXIT_CODE = 9;
    private int choice;

    public LibraryApp(Library _library)
    {
        library = _library;
        in = new Scanner(System.in);
    }

    public void run()
    {
        String title;
        String author;
        String genre;
        do
        {
            printMenu();
            choice = in.nextInt();
            in.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("What is the book title? ");
                    title = in.nextLine();
                    System.out.println("Who is the Author of the book? ");
                    author = in.nextLine();
                    System.out.println("What genre is the book? ");
                    genre = in.next();
                    Book book = new Book(title, author, genre);
                    library.addBook(book);
                    break;
                case 2:
                    library.printBooks();
                    System.out.println("What book would you like to checkout? ");
                    title = in.nextLine();
                    //finish checkout method


            }


        } while(choice != EXIT_CODE);
    }

    public void printMenu()
    {
        System.out.println("Welcome to BookTrack\n_____________________________");
        System.out.println(1 + ". Add Book");
        System.out.println(2 + ". Checkout Book");
        System.out.println(3 + ". Return Book");
        System.out.println(4 + ". Search Book");
        System.out.println(5 + ". View Books");
        System.out.println(6 + ". Add Member");
        System.out.println(7 + ". Find Member");
        System.out.println(8 + ". View Members");
        System.out.println(9 + ". Exit");
    }
}
