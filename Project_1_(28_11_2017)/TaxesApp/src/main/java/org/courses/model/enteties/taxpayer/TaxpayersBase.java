package org.courses.model.enteties.taxpayer;

import org.courses.controller.exception.StopInputException;
import org.courses.view.View;
import org.courses.view.textConstants.TextConstants;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class which describes list of all taxpayers
 */
public class TaxpayersBase {

    List<Taxpayer> taxpayerList = new LinkedList<>();

    public void setTaxpayerList(List<Taxpayer> taxpayerList) {
        this.taxpayerList = taxpayerList;
    }

    public List<Taxpayer> getTaxpayerList() {
        return taxpayerList;
    }

    /**
     * Add taxpayer to the taxpayerList.
     *
     * @param taxpayer
     */
    public void add(Taxpayer taxpayer) {
        try {
            taxpayerList.add(taxpayer);
            System.out.println("Taxpayer added to list");
        } catch (NullPointerException e) {
            System.out.println("Taxpayer was not added to list");
        }
    }

    /**
     * Compare all taxpayers name in taxpayerList with inputted taxpayerName.
     * If taxpayer name equals inputted taxpayerName, method remove taxpayer from taxpayerList.
     * @param taxpayerName taxpayerName
     */
    public void remove(String taxpayerName) {
        Iterator<Taxpayer> taxpayerIterator = taxpayerList.iterator();
        Taxpayer taxpayer;
        while (taxpayerIterator.hasNext()) {
            taxpayer = taxpayerIterator.next();
            if (taxpayer.getHuman().name().equals(taxpayerName)) {
                if (taxpayerList.remove(taxpayer)) {
                    System.out.println("Taxpayer removed from list");
                } else {
                    System.out.println("Taxpayer was not removed from list");
                }
            }
        }
    }

    /**
     * If taxpayer name equals inputted taxpayerName, method returned taxpayer from taxpayerList.
     * @param taxpayerName taxpayerName
     * @return taxpayer from taxpayerList by inputted taxpayerName
     */
    public Taxpayer getByName(String taxpayerName) throws StopInputException {
        Iterator<Taxpayer> taxpayerIterator = taxpayerList.iterator();
        Taxpayer taxpayer = null;
        while (taxpayerIterator.hasNext()) {
            taxpayer = taxpayerIterator.next();
            if (taxpayer.getHuman().name().equals(taxpayerName)) {
                return taxpayer;
            } else {
                View.printMessageFromBundle(TextConstants.Messages.TAXPAYER_NOT_FOUND);
                throw new StopInputException();
            }
        }
        return taxpayer;
    }

}
