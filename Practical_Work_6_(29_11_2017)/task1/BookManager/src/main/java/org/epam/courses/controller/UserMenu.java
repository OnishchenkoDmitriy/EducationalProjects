package org.epam.courses.controller;

import org.apache.log4j.FileAppender;
import org.apache.log4j.SimpleLayout;
import org.epam.courses.controller.service.FileSaver;
import org.epam.courses.model.constants.BookNames;
import org.epam.courses.model.entity.Book;
import org.epam.courses.model.entity.Library;
import org.epam.courses.view.TextConstants;
import org.epam.courses.view.View;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserMenu {

    private View view = new View();
    private FileSaver fileSaver = new FileSaver();
    private Library library;

    static Logger logger = Logger.getLogger(String.valueOf(UserMenu.class));



    public void run() {
        try {
            if(fileSaver.checkFile()){
                library = new Library(BookNames.values().length);
                library.putRandomBooksToLibrary();
                logger.info("creating random books");
            }else{
                try{
                    library = (Library)fileSaver.getLibraryFromFile();
                    logger.info("get books from file");
                }catch (ClassNotFoundException e){
                    library = new Library(BookNames.values().length);
                    library.putRandomBooksToLibrary();
                }
            }
            userMenu();
        } catch (IOException e) {
            fileSaver.saveLibraryToFile(library);
            System.out.println("Good buy!");
            logger.info("exit the programm");
        }
    }

    private void userMenu() throws IOException {

        Scanner scanner = new Scanner(System.in);
        view.printMessage(TextConstants.WELCOME);

        while (true){
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
                    throw new IOException();
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
