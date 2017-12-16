package org.courses;

import org.courses.model.TextEditor;

import java.io.IOException;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        try{
            textEditor.readFile(Paths.get("text.txt"));
            System.out.println(textEditor.getLinesWithReplacedChar());
        }catch (IOException e){
            System.out.println("File was not read!");
        }
    }
}
