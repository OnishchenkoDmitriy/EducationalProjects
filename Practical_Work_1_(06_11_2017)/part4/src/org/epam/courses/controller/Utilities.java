package org.epam.courses.controller;

import org.epam.courses.view.TextConstants;
import org.epam.courses.view.View;

import java.util.Scanner;

public class Utilities {

    /**
     *
     * @param sc {@see Scanner}
     * @param view {@see View}
     * @return int value (in range from 0 to 9) entered with scanner
     */
    public static int inputIntValueWithScanner(Scanner sc, View view) {
        int res=0;
        view.printMessage(TextConstants.INPUT_INT_VALUE);
        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(TextConstants.WRONG_INT_INPUT);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= 0 || res >= 10) {
                view.printMessage(TextConstants.WRONG_RANGE);
                continue ;
            }
            break;
        }
        return res;
    }
}
