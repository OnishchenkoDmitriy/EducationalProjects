package org.courses;

public class MonthsMyEnum extends MyEnum {

    public static final MonthsMyEnum JANUARY = new MonthsMyEnum("JANUARY", 31);
    public static final MonthsMyEnum FEBRUARY = new MonthsMyEnum("FEBRUARY", 28);
    public static final MonthsMyEnum MARCH = new MonthsMyEnum("MARCH", 31);
    public static final MonthsMyEnum APRIL = new MonthsMyEnum("APRIL", 30);
    public static final MonthsMyEnum MAY = new MonthsMyEnum("MAY", 31);
    public static final MonthsMyEnum JUNE = new MonthsMyEnum("JUNE", 30);
    public static final MonthsMyEnum JULY = new MonthsMyEnum("JULY", 31);
    public static final MonthsMyEnum AUGUST = new MonthsMyEnum("AUGUST", 31);
    public static final MonthsMyEnum SEPTEMBER = new MonthsMyEnum("SEPTEMBER", 30);
    public static final MonthsMyEnum OCTOBER = new MonthsMyEnum("OCTOBER", 31);
    public static final MonthsMyEnum NOVEMBER = new MonthsMyEnum("NOVEMBER", 30);
    public static final MonthsMyEnum DECEMBER = new MonthsMyEnum("DECEMBER", 31);

    private int amountOfDays;

    private MonthsMyEnum(String name, int amountOfDays) {
        super(name);
        this.amountOfDays = amountOfDays;
    }

    public MonthsMyEnum() {
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    @Override
    public String toString() {
        return name();
    }
}
