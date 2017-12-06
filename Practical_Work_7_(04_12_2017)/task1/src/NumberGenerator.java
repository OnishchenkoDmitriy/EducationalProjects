import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberGenerator {

    private int valuesAmount;
    private int minValue;
    private int maxValue;

    public NumberGenerator(int valuesAmount, int minValue, int maxValue) {
        this.valuesAmount = valuesAmount;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getRandomValue(){
        return (int)(minValue + Math.random() * maxValue);
    }

    public List getRandomList(){
        List randomList = new ArrayList();
        for (int i = 0; i < valuesAmount; i++) {
            randomList.add(getRandomValue());
        }
        return randomList;
    }

    public Set getRandomSet(){
        Set randomSet = new HashSet();
        for (int i = 0; i < valuesAmount; i++) {
            randomSet.add(getRandomValue());
        }
        return randomSet;
    }
}
