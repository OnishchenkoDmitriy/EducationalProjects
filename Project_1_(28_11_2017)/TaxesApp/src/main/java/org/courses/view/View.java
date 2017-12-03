package org.courses.view;

import org.courses.model.enteties.taxpayer.Taxpayer;
import org.courses.model.enteties.taxpayer.TaxpayersBase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class View {

    /**
     * @param message message
     * @return string from resource bundle
     */
    public static String getBundleString(String message){
        return ResourceManager.INSTANCE.getString(message);
    }

    /**
     * print any message from resource bundle
     * @param message message
     */
    public static void printMessageFromBundle(String message){
        System.out.println(getBundleString(message));
    }

    /**
     * display all elements from collection that extends List
     * @param elements list of elements
     * @param <T>
     */
    public static  <T extends List> void displayElementsFromList(T elements){
        Iterator<T> iterator = elements.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * display all elements in Hash Map
     * @param map hashMap
     */
    public static void displayElementsFromMap(HashMap map){
        Iterator<Map.Entry> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry entry = mapIterator.next();
            System.out.print(entry.getKey() + ":\n");
            System.out.println(entry.getValue());
        }
    }

    /**
     * display taxpayer
     * @param taxpayer
     */
    public static void displayTaxpayer(Taxpayer taxpayer){
        if(taxpayer != null){
            System.out.printf("%20s",taxpayer.getHuman().name() + "\n");
            displayElementsFromMap(taxpayer.getYearIncome().getYearIncomes());
        }
    }

    /**
     * display taxpayersBase
     * @param taxpayersBase taxpayersBase
     */
    public static void displayTaxpayerBase(TaxpayersBase taxpayersBase){
        List taxpayerList = taxpayersBase.getTaxpayerList();
        Iterator taxpayerBaseIterator = taxpayerList.iterator();
        if (taxpayerList.isEmpty()){
            System.out.println("List is empty");
        }else{
            while (taxpayerBaseIterator.hasNext()){
                Taxpayer taxpayer = (Taxpayer) taxpayerBaseIterator.next();
                displayTaxpayer(taxpayer);
            }
        }
    }
}
