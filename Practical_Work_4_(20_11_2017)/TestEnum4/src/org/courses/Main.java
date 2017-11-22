package org.courses;

public class Main {

    public static void main(String[] args) {

        new  MonthsMyEnum();

        System.out.println("Array list: " + MonthsMyEnum.values().toString());

        for (MyEnum monthsMyEnum: MonthsMyEnum.values()) {
            System.out.print("Name: " + monthsMyEnum.name() + "; Ordinal: " + monthsMyEnum.ordinal() + "; HashCode: " + monthsMyEnum.hashCode());
            System.out.println();
        }

    }
}
