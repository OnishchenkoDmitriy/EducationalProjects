package org.epam.courses.model;

import java.util.Arrays;
import java.util.Comparator;

public class Library {

    private int librarySize;
    private Book[] allBooks;
    private int booksCount;

    public Library(int librarySize) {
        this.librarySize = librarySize;
        allBooks = new Book[librarySize];
        booksCount = 0;
    }

    public void sortBy(Comparator<Book> comparator){
        Arrays.sort(allBooks, comparator);
    }

    public Book[] getBooksLaterThanYear(String publishingYear){
        Book[] booksLaterThanYear = new Book[booksCount];
        int index = 0;
        for (Book book:allBooks) {
            if(publishingYear.compareTo(String.valueOf(book.getPublishingYear())) < 0){
                booksLaterThanYear[index++] = book;
            }
        }
        return booksLaterThanYear;
    }

    public Book[] getBooksByAuthor(String author){
        Book[] booksByAuthor = new Book[booksCount];
        int index = 0;
        for (Book book:allBooks) {
            if(book.getAuthor().contains(author)){
                booksByAuthor[index++] = book;
            }
        }
        return booksByAuthor;
    }

    public Book[] getBooksByPublisher(String publisher){
        Book[] booksByPublisher = new Book[booksCount];
        int index = 0;
        for (Book book:allBooks) {
            if(book.getPublishingHouse().contains(publisher)){
                booksByPublisher[index++] = book;
            }
        }
        return booksByPublisher;
    }

    public Book[] getAllBooks() {
        return allBooks;
    }

    public void addBook(Book book){
        allBooks[booksCount] = book;
        booksCount++;
    }

    public boolean isFull(){
        return (booksCount == librarySize);
    }

    public void display(){
        for (Book book: allBooks) {
            System.out.println(book);
        }
    }


}

