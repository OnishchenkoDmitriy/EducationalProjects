package org.epam.courses.model;

/**
 * class changes format of the value
 */
public class ValueFormatChanger {
    private final char[] symbols = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    private int indexForSymbols = 0;
    private int indexForResultArray = 0;

    /**
     *
     * @param value some entered value that more than '0'
     * @param bitCapacity bit capacity of NumeralFormat system {@link org.epam.courses.controller.NumeralFormats}
     * @return array of chars which contains value in the required format
     */
    public char[] getValueInFormat(int value, int bitCapacity){
        char[] resultArray = new char[16];
        while (value != 0){
            indexForSymbols = value % bitCapacity;
            resultArray[indexForResultArray] = symbols[indexForSymbols];
            indexForResultArray++;
            value = value / bitCapacity;
        }
        return resultArray;
    }
}
