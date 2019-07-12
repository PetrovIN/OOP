package service;

import entity.Book;
import entity.Library;

public class LibraryService implements LibraryServiceImpl {
    @Override
    public boolean addBook(Library library, Book book) {
        boolean flag = false;
        Book books[] = library.getBooks();
        for (int i = 0; i < books.length ; i++) {
            if (books[i] == null) {
                books[i] = book;
                library.setBooks(books);
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public boolean deleteBook(Library library, int num) {
        boolean flag = false;
        Book books[] = library.getBooks();
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getId() == num) {
                books[i] = null;
                library.setBooks(books);
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public Book getBook(Library library, int num) {
        Book books[] = library.getBooks();
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getId() == num) {
                return books[i];
            }
        }
        return null;
    }
}
