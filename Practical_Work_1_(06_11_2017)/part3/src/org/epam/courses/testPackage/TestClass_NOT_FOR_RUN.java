package org.epam.courses.testPackage;

public class TestClass_NOT_FOR_RUN {

    public static void main(String[] args) {

        /*Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        //Run
        controller.processUser();*/

        int width = 8;
        int height = (width * 2) - 1;

        int[][] array = new int[width][height];
        //printArray(array);
        System.out.println();

        int middleIndex = 6;

        for (int n = 1; n < 8; n++) {
            for (int i = 1; i < 13; i++) {
                array[n][middleIndex] = n;

                /*array[n][middleIndex + 1] = n - 1;
                array[n][middleIndex - 1] = n - 1;*/


                for (int j = 1; j < n; j++) {
                    array[n][middleIndex + j] = n - j;
                    array[n][middleIndex - j] = n - j;
                }

                /*while (j < n){
                    array[n][middleIndex + j] = n - j;
                    array[n][middleIndex - j] = n - j;
                    j++;
                }*/


            }

        }


        /*for (int i = 1; i < width; i++) {
            for (int j = 1; j <= i; j++) {
                array[i][width - j] = i;

                //System.out.print(j);

            }
            for (int j = i - 1; j >= 1; j--) {
                //array[i][width + j] = j;
                //System.out.print(j);
            }
            //System.out.println();
        }*/

        //printArray(array);

        /*for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i < 5; i++) {
            triangle(0, i);
            System.out.println();

        }*/
    }

    public static void triangle(int firstValue, int secondValue){
        if(firstValue == 0){
            firstValue++;
            triangle(firstValue, secondValue);
            System.out.print(firstValue);
        }else if(firstValue < secondValue ) {
            System.out.print(firstValue++);
            triangle(firstValue, secondValue);
            System.out.print(firstValue);
        }
    }

    /*public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ":  ");
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] != 0){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }*/
}
