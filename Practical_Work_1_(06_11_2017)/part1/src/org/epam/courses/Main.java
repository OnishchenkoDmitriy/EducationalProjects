package org.epam.courses;

import org.epam.courses.controller.Controller;
import org.epam.courses.model.ValueFormatChanger;
import org.epam.courses.view.View;

public class Main {

    public static void main(String[] args) {

        ValueFormatChanger valChanger = new ValueFormatChanger();
        View view = new View();
        Controller controller = new Controller(valChanger, view);

        //Run
        controller.processUser();
    }
}
