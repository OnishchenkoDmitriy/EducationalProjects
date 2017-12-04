package org.epam.courses.view;

public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public static <T> void displayElementsInArray(T[] elements){
        for (T element: elements) {
            if(element != null){
                System.out.println(element);
            }
        }
    }
}
