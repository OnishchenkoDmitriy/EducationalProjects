package org.epam.courses.view;

import org.epam.courses.model.Book;

public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public void displayBooks(Book[] books){
        for (Book book: books) {
            if(book != null){
                System.out.println(book);
            }
        }
    }
}
