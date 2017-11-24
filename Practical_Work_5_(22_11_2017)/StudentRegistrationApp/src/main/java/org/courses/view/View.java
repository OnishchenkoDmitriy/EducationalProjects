package org.courses.view;
import java.util.*;

public class View {

    /**
     *
     * @param message message
     * @return string from resource bundle
     */
    public String getBundleString(String message){
        return ResourceManager.INSTANCE.getString(message);
    }

    /**
     * print any message from resource bundle
     * @param message message
     */
    public void printMessageFromBundle(String message){
        System.out.println(getBundleString(message));
    }

    /**
     * display all elements from collection that extends List
     * @param elements list of elements
     * @param <T>
     */
    public <T extends List> void displayElementsFromList(T elements){
        Iterator<T> iterator = elements.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
