package org.epam.courses.view;

public class View {

    public void printResult(int[] array, int firstValue, int secondValue){
        System.out.println("Perfect values from " + firstValue + " to " + secondValue + " are: ");
        printArray(array);
    }

    /**
     * method for printing any one-dimensional array
     * @param array one-dimensional array
     */
    private void printArray(int[] array){
        for (int element: array) {
            if(element != 0){
                System.out.println(element);
            }
        }
    }

    /**
     * method for printing any message
     * @param MESSAGE some String message
     */
    public void printMessage(String MESSAGE){
        System.out.println(MESSAGE);
    }
}
