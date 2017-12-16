package org.courses.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextEditor {

    private List<String> lines;

    /**
     * Read lines from file
     * @param path path
     * @throws IOException
     */
    public void readFile(Path path) throws IOException {
        try(Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream.collect(Collectors.toList());
        } catch(IOException e) {
            throw new IOException();
        }
    }

    /**
     *
     * @return lines with replaced char
     * @throws NullPointerException
     */
    public StringBuilder getLinesWithReplacedChar() throws NullPointerException{
//        return getWordsWithReplacedChars()
//                .filter(s -> s.contains("."))
//                .map(s -> s.concat("\n"))
//                .collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        List<String> result = getWordsWithReplacedChars();
        for (String word : result) {
            if(word.matches(".")){
                word.concat("\n");
            }
            stringBuilder.append(word);
        }
        return stringBuilder;
    }

    /**
     * return stream of words with replaced chars
     * @return
     */
    private List<String> getWordsWithReplacedChars(){
        return getWordsFromLine()
                .stream()
                .map(s -> s = doDelete(s).toString()).collect(Collectors.toList());
    }

    /**
     * split each line in list of lines to words
     * @return
     */
    private List<String> getWordsFromLine(){
        List<String> words = new ArrayList();
        for (String line : lines) {
            String[] word = line.split(" ");
            words.addAll(Arrays.stream(word)
                    .collect(Collectors.toList()));
        }
        return words;
    }

    /**
     * delete all char in the word witch are equals first char in it
     * @param word
     * @return list of chars
     */
    private List<String> doDelete(String word){
        List<String> characters = Arrays.asList(word.split(""));
        String firstChar = characters.get(0);
        return characters.stream()
                .filter(s -> !s.equals(firstChar))
                .collect(Collectors.toList());
    }


}


