import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;


public class Dictionary {

    public HashMap<String, String> words = new HashMap<>();

    public void addWord(String eng, String rus){
        try{
            words.put(eng, rus);
        }catch (NullPointerException e){
            System.out.println("Null exception");
            System.out.println(eng);
            System.out.println(rus);
        }


    }

    public String getTranslated(String theString) {

        Iterator<Map.Entry<String, String>> wordsIterator = words.entrySet().iterator();

        Map.Entry<String, String> result;

        while (wordsIterator.hasNext()) {
            result = wordsIterator.next();
            if (result.getKey().equals(theString)) {
                return result.getValue();
            }
        }
        throw new NoSuchElementException();
    }
}
