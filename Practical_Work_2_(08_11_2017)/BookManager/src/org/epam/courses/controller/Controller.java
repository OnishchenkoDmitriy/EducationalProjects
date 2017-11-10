package org.epam.courses.controller;

import org.epam.courses.model.BookNames;
import org.epam.courses.model.Library;
import org.epam.courses.view.View;

public class Controller {

    private View view;
    private Library library;
    private UserMenu userMenu;

    public Controller() {
        view = new View();
        library = new Library(BookNames.values().length);
        userMenu = new UserMenu(view, library);
    }

    public void processUser() {
        library.putRandomBooksToLibrary();
        userMenu.runUserMenu();
    }

}
