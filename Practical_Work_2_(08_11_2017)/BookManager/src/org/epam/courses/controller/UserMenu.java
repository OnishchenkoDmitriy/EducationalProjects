package org.epam.courses.controller;

import org.epam.courses.model.Book;
import org.epam.courses.model.Library;
import org.epam.courses.view.TextConstants;
import org.epam.courses.view.View;

import java.util.Scanner;

public class UserMenu {

    private View view;
    private Library library;

    public UserMenu(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void runUserMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        view.printMessage(TextConstants.WELCOME);

        while (!isExit){
            view.printMessage(TextConstants.WHAT_TO_DO);
            switch (scanner.next()){
                case "1":
                    showMenu();
                    break;
                case "2":
                    sortMenu(scanner);
                    break;
                case "3":
                    findMenu(scanner);
                    break;
                case "4":
                    isExit = true;
                    break;
                default:
                    view.printMessage(TextConstants.WRONG_INPUT);
                    break;
            }
        }
    }

    private void showMenu(){
        view.printMessage(TextConstants.BOOKS_IN_LIBRARY);
        view.displayBooks(library.getAllBooks());
    }

    private void sortMenu(Scanner scanner) {
        view.printMessage(TextConstants.PARAMETER_FOR_SORT);
        switch (scanner.next()) {
            case "1":
                library.sortBy(Book.NameComparator);
                view.displayBooks(library.getAllBooks());
            case "2":
                library.sortBy(Book.AuthorComparator);
                view.displayBooks(library.getAllBooks());
                break;
            case "3":
                library.sortBy(Book.PublishingHouseComparator);
                view.displayBooks(library.getAllBooks());
                break;
            case "4":
                library.sortBy(Book.PublishingYearComparator);
                view.displayBooks(library.getAllBooks());
                break;
            case "5":
                library.sortBy(Book.PriceComparator);
                view.displayBooks(library.getAllBooks());
                break;
            default:
                view.printMessage(TextConstants.WRONG_INPUT);
        }
    }

    private void findMenu(Scanner scanner){
        view.printMessage(TextConstants.PARAMETER_FOR_FIND);
        switch (scanner.next()) {
            case "1":
                scanner.nextLine();
                view.printMessage(TextConstants.ENTER_AUTHOR);
                view.displayBooks(library.getBooksByAuthor(scanner.nextLine()));
                break;
            case "2":
                scanner.nextLine();
                view.printMessage(TextConstants.ENTER_PUBLISHING_HOUSE);
                view.displayBooks(library.getBooksByPublisher(scanner.nextLine()));
                break;
            case "3":
                view.printMessage(TextConstants.ENTER_YEAR);
                view.displayBooks(library.getBooksLaterThanYear(scanner.next()));
                break;
            default:
                view.printMessage(TextConstants.WRONG_INPUT);
        }
    }

}
