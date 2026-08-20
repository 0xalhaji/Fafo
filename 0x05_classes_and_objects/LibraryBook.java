public class LibraryBook
{
    private String title;
    private String author;
    private boolean borrowed;

    /**
     * Creates a library book.
     *
     * @param title the book's title
     * @param author the book's author
     */

    public LibraryBook(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    /**
     * Borrows the book if it is currently avaliable.
     *
     */

    public void borrow()
    {
        if (!borrowed)
        {
            borrowed = true;
        }
    }

    /**
     * Returns the book if it is currently borrowed
     *
     */

    public void returnBook()
    {
        if (borrowed)
        {
            borrowed = false;
        }
    }

    /**
     * Checks whether the book is available
     *
     * @return true if the book is available
     */
    public boolean isAvailable()
    {
        if (!borrowed)
        {
            return true;
        }
        return false;
    }
}
