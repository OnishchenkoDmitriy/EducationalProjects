import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("i", "я");
        dictionary.addWord("like", "люблю");
        dictionary.addWord("programming", "програмирование");

        String[] strings = getStringValue(br, "Enter the phrase").split(" ");

        try{
            Arrays.stream(strings).forEach(string -> System.out.print(dictionary.getTranslated(string.toLowerCase()) + " "));
        }catch (NoSuchElementException e){
            System.out.println("No such word found");
        }

    }

    public static String getStringValue(BufferedReader br, String message) throws IOException {
        System.out.println(message);
        String result = br.readLine();
        return result;
    }

}


