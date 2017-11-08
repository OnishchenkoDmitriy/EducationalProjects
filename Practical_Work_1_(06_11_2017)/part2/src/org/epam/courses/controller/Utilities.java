package org.epam.courses.controller;

import org.epam.courses.view.TextConstants;
import org.epam.courses.view.View;

import java.util.Scanner;

public class Utilities {

    /**
     *
     * @param sc {@see Scanner}
     * @param view {@see View}
     * @param INPUT_INT_VALUE message that consist what value of the range you should enter(first or second)
     * @return int value that more than '0' entered with scanner
     */
    public static int inputIntValueWithScanner(Scanner sc, View view, String INPUT_INT_VALUE) {
        int res=0;
        view.printMessage(INPUT_INT_VALUE);
        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(TextConstants.WRONG_INT_INPUT);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= 0) {
                view.printMessage(TextConstants.WRONG_RANGE);
                continue ;
            }
            break;
        }
        return res;
    }
}
