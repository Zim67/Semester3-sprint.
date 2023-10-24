public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numCopies;
    private Status status;

    // Constructor
    public Book(String title, Author author, String ISBN, String publisher, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
        this.status = Status.AVAILABLE;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Borrowable interface methods

    @Override
    public boolean borrow() {
        if (status == Status.AVAILABLE) {
            if (numCopies > 0) {
                numCopies--;
                status = Status.CHECKED_OUT;
                return true;
            } else {
                System.out.println("No copies of this book are available.");
            }
        } else {
            System.out.println("This book is currently checked out.");
        }
        return false;
    }

    @Override
    public void returnBook() {
        numCopies++;
        status = Status.AVAILABLE;
    }
}