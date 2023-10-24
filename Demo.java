import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Create 30 books, 10 authors, and 20 patrons

        // Create 3 array lists to store the books, authors, and patrons
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Patron> patrons = new ArrayList<>();

        // Create a library which contains all of the entities
        Library library = new Library(books, authors, patrons);

        // Create 10 authors with different names
        Author author1 = new Author("George Orwell", "123 Orwell Street, London", "123-4567-8910", "25 June 1903");
        Author author2 = new Author("Jane Austen", "456 Austen Lane, Bath", "123-4567-8911", "16 December 1775");
        Author author3 = new Author("Mark Twain", "789 Twain Avenue, Hannibal", "123-4567-8912", "30 November 1835");
        Author author4 = new Author("Agatha Christie", "234 Christie Road, Torquay", "123-4567-8913", "15 September 1890");
        Author author5 = new Author("F. Scott Fitzgerald", "567 Fitzgerald Place, St. Paul", "123-4567-8914", "24 September 1896");
        Author author6 = new Author("Leo Tolstoy", "Tolstoy Street, Moscow", "123-4567-8915", "9 September 1828");
        Author author7 = new Author("Jules Verne", "Verne Lane, Nantes", "123-4567-8916", "8 February 1828");
        Author author8 = new Author("Charles Dickens", "Dickens Street, Portsmouth", "123-4567-8917", "7 February 1812");
        Author author9 = new Author("H.G. Wells", "Wells Road, Bromley", "123-4567-8918", "21 September 1866");
        Author author10 = new Author("Mary Shelley", "Shelley Lane, London", "123-4567-8919", "30 August 1797");

        // Create 30 books with different titles
        Book book1 = new Book("1984", author1, "9780451524935", "Penguin Books", 10, Status.AVAILABLE);
        Book book2 = new Book("Pride and Prejudice", author2, "9780141439518", "Penguin Classics", 10, Status.AVAILABLE);
        Book book3 = new Book("The Adventures of Huckleberry Finn", author3, "9780486280615", "Dover Publications", 10, Status.AVAILABLE);
        Book book4 = new Book("Murder on the Orient Express", author4, "9780007119318", "William Collins & Sons", 10, Status.AVAILABLE);
        Book book5 = new Book("The Great Gatsby", author5, "9780743273565", "Scribner", 10, Status.AVAILABLE);
        Book book6 = new Book("War and Peace", author6, "9780199232765", "Oxford University Press", 10, Status.AVAILABLE);
        Book book7 = new Book("Twenty Thousand Leagues Under the Sea", author7, "9780140620636", "Penguin Classics", 10, Status.AVAILABLE);
        Book book8 = new Book("Oliver Twist", author8, "9780141439747", "Penguin Classics", 10, Status.AVAILABLE);
        Book book9 = new Book("The War of the Worlds", author9, "9780486295060", "Dover Publications", 10, Status.AVAILABLE);
        Book book10 = new Book("Frankenstein", author10, "9780486282114", "Dover Publications", 10, Status.AVAILABLE);
        Book book11 = new Book("Moby-Dick", author6, "9781853260087", "Wordsworth Editions", 10, Status.AVAILABLE);
        Book book12 = new Book("A Tale of Two Cities", author8, "9781853260391", "Wordsworth Editions", 10, Status.AVAILABLE);
        Book book13 = new Book("The Time Machine", author9, "9780486284729", "Dover Publications", 10, Status.AVAILABLE);
        Book book14 = new Book("Dracula", author7, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book15 = new Book("Crime and Punishment", author6, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book16 = new Book("Wuthering Heights", author8, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book17 = new Book("Alice's Adventures in Wonderland", author10, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book18 = new Book("Dr. Jekyll and Mr. Hyde", author9, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book19 = new Book("The Picture of Dorian Gray", author5, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book20 = new Book("Anna Karenina", author6, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book21 = new Book("Little Women", author8, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book22 = new Book("The Call of the Wild", author3, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book23 = new Book("The Catcher in the Rye", author5, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book24 = new Book("To Kill a Mockingbird", author4, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book25 = new Book("The Odyssey", author7, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book26 = new Book("Lord of the Flies", author2, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book27 = new Book("The Road", author3, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book28 = new Book("Brave New World", author1, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book29 = new Book("The Hobbit", author10, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);
        Book book30 = new Book("The Grapes of Wrath", author9, "9780199536438", "Oxford World's Classics", 10, Status.AVAILABLE);

        // Create 20 patrons with different names
        Patron patron1 = new Patron("John Smith", "12 Main Street, London", "123-456-7890", "1 January 1980");
        Patron patron2 = new Patron("Jane Doe", "34 Park Avenue, London", "123-456-7891", "1 February 1985");
        Patron patron3 = new Patron("Michael Johnson", "56 Broadway, London", "123-456-7892", "15 March 1972");
        Patron patron4 = new Patron("Emily Smith", "78 Oxford Street, London", "123-456-7893", "20 April 1990");
        Patron patron5 = new Patron("William Brown", "5 Main Street, London", "123-456-7894", "5 May 1988");
        Patron patron6 = new Patron("Ava Johnson", "7 Park Avenue, London", "123-456-7895", "12 June 1982");
        Patron patron7 = new Patron("Oliver Wilson", "9 Broadway, London", "123-456-7896", "30 July 1978");
        Patron patron8 = new Patron("Sophia Williams", "11 Oxford Street, London", "123-456-7897", "8 August 1995");
        Patron patron9 = new Patron("James Jones", "14 Main Street, London", "123-456-7898", "2 October 1980");
        Patron patron10 = new Patron("Amelia Taylor", "16 Park Avenue, London", "123-456-7899", "17 November 1975");
        Patron patron11 = new Patron("Benjamin Davies", "18 Broadway, London", "123-456-7900", "4 December 1992");
        Patron patron12 = new Patron("Mia Evans", "22 Oxford Street, London", "123-456-7901", "21 January 1984");
        Patron patron13 = new Patron("Elijah Wilson", "24 Main Street, London", "123-456-7902", "13 February 1979");
        Patron patron14 = new Patron("Charlotte Brown", "26 Park Avenue, London", "123-456-7903", "9 March 1991");
        Patron patron15 = new Patron("Lucas Miller", "28 Broadway, London", "123-456-7904", "26 April 1986");
        Patron patron16 = new Patron("Grace Wilson", "30 Oxford Street, London", "123-456-7905", "14 May 1983");
        Patron patron17 = new Patron("Henry Moore", "32 Main Street, London", "123-456-7906", "7 June 1977");
        Patron patron18 = new Patron("Luna Clark", "36 Park Avenue, London", "123-456-7907", "23 July 1994");
        Patron patron19 = new Patron("Logan Young", "38 Broadway, London", "123-456-7908", "10 August 1989");
        Patron patron20 = new Patron("Thomas Smith", "40 Oxford Street, London", "123-456-7909", "5 September 1982");

        // Add the books, authors, and patrons to their respective array lists
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);
        books.add(book16);
        books.add(book17);
        books.add(book18);
        books.add(book19);
        books.add(book20);
        books.add(book21);
        books.add(book22);
        books.add(book23);
        books.add(book24);
        books.add(book25);
        books.add(book26);
        books.add(book27);
        books.add(book28);
        books.add(book29);
        books.add(book30);

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);
        authors.add(author6);
        authors.add(author7);
        authors.add(author8);
        authors.add(author9);
        authors.add(author10);

        patrons.add(patron1);
        patrons.add(patron2);
        patrons.add(patron3);
        patrons.add(patron4);
        patrons.add(patron5);
        patrons.add(patron6);
        patrons.add(patron7);
        patrons.add(patron8);
        patrons.add(patron9);
        patrons.add(patron10);
        patrons.add(patron11);
        patrons.add(patron12);
        patrons.add(patron13);
        patrons.add(patron14);
        patrons.add(patron15);
        patrons.add(patron16);
        patrons.add(patron17);
        patrons.add(patron18);
        patrons.add(patron19);
        patrons.add(patron20);

        // Add all appropriate books to the correct Author's list of books written
        author1.addBook(book1);
        author2.addBook(book2);
        author3.addBook(book3);
        author4.addBook(book4);
        author5.addBook(book5);
        author6.addBook(book6);
        author7.addBook(book7);
        author8.addBook(book8);
        author9.addBook(book9);
        author10.addBook(book10);

          // Test all methods of all classes

        // Testing methods related to the Library class
        // Get the list of books in the library
        System.out.println("Books in the library:");
        System.out.println(library.getBooks());

        // Get the list of authors in the library
        System.out.println("Authors in the library:");
        System.out.println(library.getAuthors());

        // Get the list of patrons in the library
        System.out.println("Patrons in the library:");
        System.out.println(library.getPatrons());

        // Search for a book by title
        System.out.println("Search by title - 'The Lord Of The Rings':");
        System.out.println(library.searchByTitle("The Lord Of The Rings"));

        // Testing methods related to the Author class
        // Getting and setting the date of birth
        System.out.println("Author 1's Date of Birth:");
        System.out.println(author1.getDateOfBirth());

        // Getting the list of books written by the author
        System.out.println("Books written by Author 1:");
        System.out.println(author1.getListOfBooksWritten());

        // Printing the string representation of the author
        System.out.println("Author 1's Info:");
        System.out.println(author1.toString());

        // Testing methods related to the Patron class
        // Getting and setting the name
        System.out.println("Patron 1's Name:");
        System.out.println(patron1.getName());

        // Getting the list of books borrowed by the patron
        System.out.println("Books borrowed by Patron 1:");
        System.out.println(patron1.getListOfBooksBorrowed());

        // Checking if the patron has borrowed a specific book
        System.out.println("Has Patron 1 borrowed book1?");
        System.out.println(patron1.hasBorrowedBook(book1));

        // Printing the string representation of the patron
        System.out.println("Patron 1's Info:");
        System.out.println(patron1.toString());

        // Testing methods of the Book class
        // Getting and setting the title
        System.out.println("Book 1's Title:");
        System.out.println(book1.getTitle());

        // Getting and setting the author
        System.out.println("Book 1's Author:");
        System.out.println(book1.getAuthor());

        // Getting and setting the number of copies
        System.out.println("Book 1's Number of Copies:");
        System.out.println(book1.getNumberOfCopies());

        // Borrow a book
        System.out.println("Borrowing a copy of book1...");
        book1.borrowBook(patron1);

        // Print the list of books borrowed by the patron
        System.out.println("Books borrowed by Patron 1:");
        System.out.println(patron1.getListOfBooksBorrowed());

        // Return a book
        System.out.println("Returning a copy of book1...");
        book1.returnBook(patron1);

        // Print the list of books borrowed by the patron
        System.out.println("Books borrowed by Patron 1:");
        System.out.println(patron1.getListOfBooksBorrowed());
    }
}
