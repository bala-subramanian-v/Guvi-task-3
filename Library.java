class Library {

    private Book[] books;
    private int count;

    // Constructor
    Library() {
        books = new Book[5];   // Array to store 5 books
        count = 0;
    }

    // Method to add a book
    void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully");
        } else {
            System.out.println("Library is full");
        }
    }

    // Method to replace book details using bookID
    void replaceBook(int bookID, String newTitle, String newAuthor) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                found = true;
                System.out.println("Book details updated");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Method to display all books
    void displayBooks() {
        if (count == 0) {
            System.out.println("No books available");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Book ID: " + books[i].getBookID());
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Available: " + books[i].isAvailable());
            System.out.println("----------------------");
        }
    }
}
