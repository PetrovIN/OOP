package entity;

import java.util.Arrays;

public class Library {
    private Book books[];

    public Library (int size) {
        books = new Book[size];
    }

    public Library() {
        this(10);
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                result.append(books[i].toString());
        }
        return result.toString();
    }
}
