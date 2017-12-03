package org.courses.controller.service;

import org.courses.view.textConstants.TextConstants;
import org.courses.view.View;

import java.io.BufferedReader;
import java.io.IOException;

public class Utils {

    /**
     * Display message.
     * Check inputted string with regex.
     * If inputted string not matches regex method tries to get inputted value again,
     * or throws IOException if pressed "0".
     * @param br bufferedReader
     * @param message message
     * @param regex regex
     * @return inputted string with regex
     * @throws IOException
     */
    public static String getStringValue(BufferedReader br, String message, String regex) throws IOException {
        View.printMessageFromBundle(message);
        regex = View.getBundleString(regex);
        String result = br.readLine();
        while (!result.matches(regex)) {
            View.printMessageFromBundle(TextConstants.Messages.WRONG_INPUT);
            View.printMessageFromBundle(TextConstants.Messages.PRESS_ZERO_TO_EXIT);
            result = br.readLine();
            if (result.equals("0")) {
                throw new IOException();
            }
        }
        return result;
    }
}
