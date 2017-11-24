package org.courses;

import org.courses.controller.UserMenu;
import org.courses.model.StudentJournal;
import org.courses.view.View;

public class Main {

    public static void main(String[] args) {
        new UserMenu(new View(), new StudentJournal()).runUserMenu();
    }
}
