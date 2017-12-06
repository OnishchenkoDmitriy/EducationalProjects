import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int valuesAmount = Integer.valueOf(getStringValue(br, "Enter values amount: "));
        int minValue = Integer.valueOf(getStringValue(br, "Enter min value: "));
        int maxValue = Integer.valueOf(getStringValue(br, "Enter max value: "));

        NumberGenerator numberGenerator = new NumberGenerator(valuesAmount, minValue, maxValue);

        System.out.println("Random List");
        numberGenerator.getRandomList().stream().forEach(number -> System.out.print(number + "; "));
        System.out.println();

        System.out.println("Random Set");
        numberGenerator.getRandomSet().stream().forEach(number -> System.out.print(number + "; "));
    }


    public static String getStringValue(BufferedReader br, String message) throws IOException {
        System.out.println(message);;
        String result = br.readLine();
        return result;
    }


}


