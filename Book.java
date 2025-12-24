public class Book {
        // Attributes
        private int bookID;
        private String title;
        private String author;
        private boolean isAvailable;

        // Constructor to initialize book attributes
        Book(int bookID, String title, String author, boolean isAvailable) {
            this.bookID = bookID;
            this.title = title;
            this.author = author;
            this.isAvailable = isAvailable;
        }

        // Getter methods
        int getBookID() {
            return bookID;
        }

        String getTitle() {
            return title;
        }

        String getAuthor() {
            return author;
        }

        boolean isAvailable() {
            return isAvailable;
        }

        // Setter methods
        void setTitle(String title) {
            this.title = title;
        }

        void setAuthor(String author) {
            this.author = author;
        }
}


