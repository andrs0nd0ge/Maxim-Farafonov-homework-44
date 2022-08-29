package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BookDataModel {
    private Book book = new Book("The Fault in Our Stars", "John Green");
    private List<Book> books = new ArrayList<>();

    public BookDataModel() {
        books.add(new Book(1, "The Fault in Our Stars", "John Green", "Is given to Brad Barnard"));
        books.add(new Book(2, "What If? Serious Scientific Answers to Absurd Hypothetical Questions", "Randall Munroe", "Is given to Jeffery Carney"));
        books.add(new Book(3, "Life of Pi", "Yann Martel", "Is given to Jeffery Carney"));
        books.add(new Book(4, "1984", "George Orwell", "Is given to Brad Barnard"));
        books.add(new Book(5, "The Alchemist", "Paulo Coelho", "Is given to Philip Salter"));
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
