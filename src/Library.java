import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    /*
    Methods to implement:
    -addBook(Book)) DONE
    -checkout(Book) DONE
    -returnBook(Book) DONE
    -findBook(title) DONE
    -findBookAuth(Author)DONE
    -findBooks(Genre) Return list of books
    -printBooks() DONE

    -addMember(Member) DONE
    -FindMember(name) overload DONE
    -findMember(id)DONE
    -printMembers() DONE
     */

    public void addBook(Book _book)
    {
        books.add(_book);
    }
    public void addMember(Member _member)
    {
        members.add(_member);
    }
    public void checkout(String title)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getTitle().equals(title))
            {
                if (!books.get(i).isAvailable())
                {
                    System.out.println("Book is already checked out.");
                    return;
                }

                books.get(i).setAvailable(false);
                System.out.println("Book was successfully checked out.");
                return;
            }
        }

        System.out.println("Book is not in the system.");
    }
    public void returnBook(String title)
    {
        for (Book b : books)
        {
            if (b.getTitle().equals(title))
            {
                if (b.isAvailable())
                {
                    System.out.println("This book is already returned.");
                    return;
                }

                b.setAvailable(true);
                System.out.println("Book successfully returned.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
    public void printBooks()
    {

        System.out.print("[");

        boolean first = true;

        for (Book b : books)
        {
            if (b.isAvailable())
            {
                if (!first)
                {
                    System.out.print(", ");
                }

                System.out.print(b.getTitle());
                first = false;
            }
        }

        System.out.println("]");

    }
    public boolean findBook(String _title)
    {
        int pos = 0;
        boolean found = false;
        if(!found)
        {
            for (int i = 0; i < books.size(); i++) {

                    if (books.get(i).getTitle().equals(_title) && books.get(i).isAvailable())
                    {
                        found = true;
                    }
            }
        }
        return found;
    }
    public int findBookAuth(String _author)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getAuthor().equals(_author))
            {
                return i;
            }
        }

        throw new NoSuchElementException("Book does not exist");
    }

    public boolean findMember(int _id)
    {
        boolean found = false;
        for(int i = 0; i < members.size() && !found; i++)
        {
            if(members.get(i).getId() == _id)
            {
                found = true;
            }
        }
        return found;
    }
    public void printMembers()
    {
        System.out.print("[" + members.getFirst().getName() + ", ");
        for(int i = 1; i < members.size() - 1; i++)
        {
            System.out.print(members.get(i).getName() + ", ");
        }
        System.out.println(members.getLast().getName() + "]");
    }
    public boolean findMember(String _name)
    {
        boolean found = false;
        for(int i = 0; i < members.size() && !found; i++)
        {
            if(members.get(i).getName().equals(_name))
            {
                found = true;
            }
        }
        return found;
    }




}
