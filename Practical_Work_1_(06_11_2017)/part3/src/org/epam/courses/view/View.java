package org.epam.courses.view;

public class View {

    /**
     * method for printing any message
     * @param MESSAGE some String message
     */
    public void printMessage(String MESSAGE){
        System.out.println(MESSAGE);
    }

    /**
     * method for printing any two-dimensional array without '0'
     * @param array two-dimensional array
     */
    public void printArrayWithoutZero(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] != 0){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
