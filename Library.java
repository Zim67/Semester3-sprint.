import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Methods for book management

    public void addBook(Book book) {
        books.add(book);
    }

    public void editBook(Book book, String newTitle, String newISBN, String newPublisher, int newNumCopies) {
        book.setTitle(newTitle);
        book.setISBN(newISBN);
        book.setPublisher(newPublisher);
        book.setNumCopies(newNumCopies);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    // Methods for author management

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void editAuthor(Author author, String newName, String newDateOfBirth) {
        author.setName(newName);
        author.setDateOfBirth(newDateOfBirth);
    }

    public void deleteAuthor(Author author) {
        authors.remove(author);
    }

    // Methods for patron management

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void editPatron(Patron patron, String newName, String newAddress, String newPhoneNumber) {
        patron.setName(newName);
        patron.setAddress(newAddress);
        patron.setPhoneNumber(newPhoneNumber);
    }

    public void deletePatron(Patron patron) {
        patrons.remove(patron);
    }

    // Method for book searching

    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book searchBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
