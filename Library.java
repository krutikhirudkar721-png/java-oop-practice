// Q2: Write a Java program to create a Book class with title, author, and ISBN.
// Create a Library class to add, remove, and display books.

import java.util.*;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " | " + b.author + " | " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("OOP", "Robert", "102"));

        lib.displayBooks();
    }
}
