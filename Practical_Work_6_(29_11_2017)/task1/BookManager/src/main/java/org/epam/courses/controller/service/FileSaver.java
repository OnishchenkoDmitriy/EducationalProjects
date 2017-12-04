package org.epam.courses.controller.service;


import org.epam.courses.model.entity.Library;

import java.io.*;


/**
 * Class that works with file
 */
public class FileSaver {

    public final String path = new File("").getAbsolutePath();
    public final File libraryFile = new File(path + "\\library.ser");


    public boolean checkFile() {
        try {
            if (!libraryFile.exists()) {
                libraryFile.createNewFile();
                System.out.println("File was created!");
                return true;
            }
        } catch (IOException e) {
            System.out.println("File already created");
            return false;
        }
        return false;
    }


    /**
     * write taxpayers to file.
     * @param library
     */
    public void saveLibraryToFile(Library library) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(libraryFile))) {
            outputStream.writeObject(library);
            outputStream.flush();
            System.out.println("Saving information...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return library from file
     * @throws IOException
     */
    public Object getLibraryFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(libraryFile))) {
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Something wrong with file");
            throw new ClassNotFoundException();
        }
    }

}

