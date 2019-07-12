package service;

import entity.Book;
import entity.Library;

public class DemoService {
    Book book = new Book(1, "Мастер и Маргарита", "Михаил Афанасьевич Булгаков");
    Book book1 = new Book(2, "Война и мир", "Лев Николаевич Толстой");
    Book book2 = new Book(3, "Евгений Онегин", "Александр Сергеевич Пушкин");
    Library library = new Library(10);
    public void start() {
        LibraryService libraryService = new LibraryService();
        libraryService.addBook(library,book);
        libraryService.addBook(library,book1);
        libraryService.addBook(library,book2);
        libraryService.deleteBook(library,2);
        System.out.println(libraryService.getBook(library, 1).toString());
        //System.out.println(library.toString());
    }
}
