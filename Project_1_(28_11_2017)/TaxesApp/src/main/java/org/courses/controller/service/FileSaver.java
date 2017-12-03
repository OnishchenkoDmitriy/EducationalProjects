package org.courses.controller.service;

import org.courses.model.enteties.taxpayer.Taxpayer;
import org.courses.view.View;
import org.courses.view.textConstants.TextConstants;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Class that works with file
 */
public class FileSaver {

    public final String path = new File("").getAbsolutePath();
    public final File taxpayerFile = new File(path + "\\taxpayers.ser");

    /**
     * If file not created method creates new file
     */
    public void checkFile() {
        try {
            if (!taxpayerFile.exists()) {
                taxpayerFile.createNewFile();
                System.out.println("File was created!");
            }
        } catch (IOException e) {
            System.out.println("File already created");
            e.printStackTrace();
        }
    }


    /**
     * write taxpayers to file.
     * @param taxpayers
     */
    public void saveTaxpayerToFile(List<Taxpayer> taxpayers) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(taxpayerFile))) {
            outputStream.writeObject(taxpayers);
            outputStream.flush();
            View.printMessageFromBundle(TextConstants.Messages.SAVING_INFORMATION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return taxpayers from file
     * @throws IOException
     */
    public Object getTaxpayersFromFile() throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(taxpayerFile))) {
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Something wrong with file");
            throw new IOException();
        }
    }

}

