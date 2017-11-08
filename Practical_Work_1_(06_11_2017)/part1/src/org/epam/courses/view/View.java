package org.epam.courses.view;

import org.epam.courses.controller.NumeralFormats;

public class View {


    /**
     *
     * @param array array of chars which contains value in the required format
     * @param numSys numeral format {@link NumeralFormats}
     */
    public void printResult(char[] array, NumeralFormats numSys){
        System.out.println(numSys + " value: ");
        printArray(array);
    }

    /**
     * method for printing any one-dimensional array
     * @param array one-dimensional array
     */
    private void printArray(char[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    /**
     * method for printing any message
     * @param MESSAGE some String message
     */
    public void printMessage(String MESSAGE){
        System.out.println(MESSAGE);
    }
}
