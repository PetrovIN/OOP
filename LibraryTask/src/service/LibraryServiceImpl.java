package service;
import entity.Book;
import entity.Library;

public interface LibraryServiceImpl {
    boolean addBook(Library library, Book book);
    boolean deleteBook(Library library, int num);
    Book getBook(Library library, int num);
}
