package org.epam.courses.controller;

import org.epam.courses.model.ValueFormatChanger;
import org.epam.courses.view.View;

import java.util.Scanner;

import static org.epam.courses.controller.NumeralFormats.*;

public class Controller {

    ValueFormatChanger valChanger;
    View view;

    public Controller(ValueFormatChanger valChanger, View view) {
        this.valChanger = valChanger;
        this.view = view;
    }

    public void processUser() {
        int enteredValue = Utilities.inputIntValueWithScanner(new Scanner(System.in), view);
        getResults(enteredValue);
    }

    /**
     * method for printing int value in different formats such as: BIN, OCT, HEX
     * @param enteredValue some int value that more than '0'
     */
    private void getResults(int enteredValue) {
        char[] binResult = valChanger.getValueInFormat(enteredValue, BIN.getBiteCapacity());
        view.printResult(binResult, BIN);
        char[] octResult = valChanger.getValueInFormat(enteredValue, OCT.getBiteCapacity());
        view.printResult(octResult, OCT);
        char[] hexResult = valChanger.getValueInFormat(enteredValue, HEX.getBiteCapacity());
        view.printResult(hexResult, HEX);
    }

}
