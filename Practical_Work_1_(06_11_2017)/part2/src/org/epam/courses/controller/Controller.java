package org.epam.courses.controller;

import org.epam.courses.model.PerfectValuesFinder;
import org.epam.courses.view.TextConstants;
import org.epam.courses.view.View;

import java.util.Scanner;

public class Controller {

    private PerfectValuesFinder perfectValuesFinder;
    private View view;

    public Controller(PerfectValuesFinder perfectValuesFinder, View view) {
        this.perfectValuesFinder = perfectValuesFinder;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        perfectValuesFinder.setFirstValue(Utilities.inputIntValueWithScanner(sc, view, TextConstants.INPUT_FIRST_INT_VALUE));
        perfectValuesFinder.setSecondValue(Utilities.inputIntValueWithScanner(sc, view, TextConstants.INPUT_SECOND_INT_VALUE));
        view.printResult(perfectValuesFinder.getPerfectValuesInRange(),
                perfectValuesFinder.getFirstValue(),
                perfectValuesFinder.getSecondValue());
    }
}
