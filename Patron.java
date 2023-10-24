import java.util.ArrayList;

public class Patron {
    // Attributes
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private ArrayList<Book> listOfBooksBorrowed;

    // Constructors

    public Patron(String name, String address, String phoneNumber, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.listOfBooksBorrowed = new ArrayList<>();
    }

    public Patron(String name, String address, String phoneNumber, String dateOfBirth, ArrayList<Book> listOfBooksBorrowed) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.listOfBooksBorrowed = listOfBooksBorrowed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Book> getListOfBooksBorrowed() {
        return listOfBooksBorrowed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setListOfBooksBorrowed(ArrayList<Book> listOfBooksBorrowed) {
        this.listOfBooksBorrowed = listOfBooksBorrowed;
    }

    // Other methods
    public void addBook(Book book) {
        listOfBooksBorrowed.add(book);
    }

    public void removeBook(Book book) {
        listOfBooksBorrowed.remove(book);
    }

    public boolean hasBorrowedBook(Book book) {
        return listOfBooksBorrowed.contains(book);
    }

    @Override
    public String toString() {
        return "Patron Information:\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "List of Books Borrowed: " + listOfBooksBorrowed;
    }
}

