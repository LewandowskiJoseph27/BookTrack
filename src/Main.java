//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("test", "Me", "Scary", 1234);
        Book book2 = new Book("Alice in Wonderland", "JK Rowling", "Fantasy", 54321);
        Book book3 = new Book("Harry Potter 1", "JK Rowling", "Magic", 6578);
        Book book4 = new Book("Of Mice And Men", "Ormwell", "Fiction", 99987);
        Member anna = new Member("anna");
        Member jake = new Member("Jake");
        Member aleena = new Member("aleena");

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getGenre());
        System.out.println(book1.getTitle());

        book1.setTitle("The time i went swimming");
        System.out.println("_______________");
        System.out.println(book1.getTitle());
        System.out.println(anna.getName() + ": " + anna.getId());
        System.out.println(jake.getName() + ": " + jake.getId());
        System.out.println(aleena.getName() + ": " + aleena.getId());

        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addMember(anna);
        lib.addMember(jake);
        lib.addMember(aleena);
        lib.printBooks();
        Book testBook = new Book("ABC", "Dr Seuss", "Kids", 3456);
        lib.checkout(book2);
        lib.returnBook(book2);
        int pos = lib.findBook("Of Mice And Men");
        int pos2 = lib.findBookAuth("Me");
        System.out.println(lib.findMember(5001));
        lib.printMembers();



    }
}