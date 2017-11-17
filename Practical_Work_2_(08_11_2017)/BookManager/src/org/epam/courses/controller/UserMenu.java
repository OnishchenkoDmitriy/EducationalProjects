package org.epam.courses.controller;

import org.epam.courses.model.entity.Book;
import org.epam.courses.model.entity.Library;
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
            switch (scanner.nextLine()){
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
        view.displayElementsInArray(library.getAllBooks());
    }

    private void sortMenu(Scanner scanner) {
        view.printMessage(TextConstants.PARAMETER_FOR_SORT);
        switch (scanner.nextLine()) {
            case "1":
                library.sortBy(Book.NameComparator);
                view.displayElementsInArray(library.getAllBooks());
            case "2":
                library.sortBy(Book.AuthorComparator);
                view.displayElementsInArray(library.getAllBooks());
                break;
            case "3":
                library.sortBy(Book.PublishingHouseComparator);
                view.displayElementsInArray(library.getAllBooks());
                break;
            case "4":
                library.sortBy(Book.PublishingYearComparator);
                view.displayElementsInArray(library.getAllBooks());
                break;
            case "5":
                library.sortBy(Book.PriceComparator);
                view.displayElementsInArray(library.getAllBooks());
                break;
            default:
                view.printMessage(TextConstants.WRONG_INPUT);
        }
    }

    private void findMenu(Scanner scanner){
        view.printMessage(TextConstants.PARAMETER_FOR_FIND);
        switch (scanner.nextLine()) {
            case "1":
                view.printMessage(TextConstants.ENTER_AUTHOR);
                view.displayElementsInArray(library.getBooksByAuthor(scanner.nextLine()));
                break;
            case "2":
                view.printMessage(TextConstants.ENTER_PUBLISHING_HOUSE);
                view.displayElementsInArray(library.getBooksByPublisher(scanner.nextLine()));
                break;
            case "3":
                view.printMessage(TextConstants.ENTER_YEAR);
                view.displayElementsInArray(library.getBooksLaterThanYear(scanner.nextLine()));
                break;
            default:
                view.printMessage(TextConstants.WRONG_INPUT);
        }
    }

}
