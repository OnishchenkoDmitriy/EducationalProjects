package org.courses.model.enteties.income;

/**
 * List of income types
 */
public enum Incomes {

    MAIN_WORK_PLACE("Main work place", 15),
    SECOND_WORK_PLACE("Second work place", 15),
    AUTHOR_FEE("Author fee", 5),
    SALE_OF_PROPERTIES("Sale of properties", 15),
    GIFT_SUMS_AND_PROPERTIES("Gift sums and properties", 5),
    FROM_ABROAD("From abroad", 15);

    /**
     * name used for income description
     */
    private String name;

    /**
     * taxValue is tax in percent for each type of income
     */
    private double taxValue;

    Incomes(String name, double taxValue) {
        this.name = name;
        this.taxValue = taxValue;
    }

    /**
     * @return taxValue
     */
    public double getTaxValue() {
        return taxValue;
    }

    @Override
    public String toString() {
        return name;
    }
}
