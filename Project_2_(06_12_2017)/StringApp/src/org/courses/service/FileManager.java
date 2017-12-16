package org.courses.service;

import java.io.*;



public class FileManager {

    public final String path = new File("").getAbsolutePath();
    public final File textFile = new File(path + "\\text.txt");
    private BufferedReader br = null;

    public BufferedReader getBr(){
        try {
            return br = new BufferedReader(new FileReader(textFile));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return null;
    }

}

