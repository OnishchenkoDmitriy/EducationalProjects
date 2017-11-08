package org.epam.courses;

import org.epam.courses.controller.Controller;
import org.epam.courses.model.PerfectValuesFinder;
import org.epam.courses.view.View;

public class Main {

    public static void main(String[] args) {
        PerfectValuesFinder perfectValuesFinder = new PerfectValuesFinder();
        View view = new View();
        //Run
        new Controller(perfectValuesFinder, view).processUser();
    }
}