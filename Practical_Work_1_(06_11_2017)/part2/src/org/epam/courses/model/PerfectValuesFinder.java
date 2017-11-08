package org.epam.courses.model;

public class PerfectValuesFinder {

    private int firstValue;
    private int secondValue;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
    public int getFirstValue() {
        return firstValue;
    }
    public int getSecondValue() {
        return secondValue;
    }

    /**
     *
     * @return array of perfect values that consist in the range between firstValue and secondValue
     */
    public int[] getPerfectValuesInRange(){
        int[] result = new int [5];
        int indexForResult = 0;

        for (int i = firstValue; i <= secondValue ; i++) {
            int temp = 0;
            for (int j = 1; j < i; j++) {
                if((i % j) == 0){
                    temp += j;
                }
            }
            if(temp == i){
                result[indexForResult] = temp;
                indexForResult++;
            }
        }
        return result;
    }

}
