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
    public void checkout(Book _book)
    {
        boolean found = false;
        int pos = 0;
        for(int i = 0; i < books.size(); i++)
        {
            if(books.get(i).getTitle() == _book.getTitle())
            {
                pos = i;
                found = true;
            }
        }
        if(found)
        {
            System.out.println("Book was successfully checkout out");
            books.get(pos).setAvailable(false);
        }
        else
        {
            System.out.println("Book is not in the system");
        }
    }
    public void returnBook(Book _book)
    {
        boolean found = false;
        int pos = 0;
        for(int i = 0; i < books.size(); i++)
        {
            if(books.get(i).getTitle() == _book.getTitle())
            {
                pos = i;
                found = true;
            }
        }
        if(found && books.get(pos).isAvailable() == false)
        {
            System.out.println("Book was successfully returned");
            books.get(pos).setAvailable(true);
        }
        else if(found && books.get(pos).isAvailable() == true)
        {
            System.out.println("Book was not previously checkout");
        }
        else
        {
            System.out.println("Book is not in the system");
        }
    }
    public void printBooks()
    {
        System.out.print("[" + books.getFirst().getTitle() + ", ");
        for(int i = 1; i < books.size() - 1; i++)
        {
            System.out.print(books.get(i).getTitle() + ", ");
        }
        System.out.println(books.getLast().getTitle() + "]");

    }
    public int findBook(String _title)
    {
        int pos = 0;
        boolean found = false;
        if(!found)
        {
            for (int i = 0; i < books.size(); i++) {

                    if (books.get(i).getTitle().equals(_title))
                    {
                        found = true;
                        pos = i;
                    }
            }
        }
        else {
            throw new NoSuchElementException("Book does not exist");
        }
        return pos;
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
