public class Book
{
    private String title;
    private String author;
    private String genre;
    private int isbn;
    private boolean available;

    public Book(String _title, String _author, String _genre,
                int _isbn)
    {
        title = _title;
        author = _author;
        genre = _genre;
        isbn = _isbn;
        available = true;
    }

    public void setTitle(String _title)
    {
        title = _title;
    }
    public void setAuthor(String _author)
    {
        author = _author;
    }
    public void setGenre(String _genre)
    {
        genre = _genre;
    }
    public void setIsbn(int _isbn)
    {
        isbn = _isbn;
    }
    public void setAvailable(boolean _available)
    {
        available = _available;
    }

    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getIsbn()
    {
        return isbn;
    }
    public boolean isAvailable()
    {
        return available;
    }


}
