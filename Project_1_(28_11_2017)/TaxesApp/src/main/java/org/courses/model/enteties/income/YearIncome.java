package org.courses.model.enteties.income;

import java.io.Serializable;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The class describes all monthly incomes in the year
 */
public class YearIncome implements Serializable {

    /**
     * all monthly incomes in the year
     */
    HashMap<Month, MonthlyIncome> yearIncomes = new HashMap<>();

    /**
     * Adds new monthly income to yearIncomes.
     * If yearIncomes contains such month, method replace old monthly income to new.
     * @param month         month
     * @param monthlyIncome monthlyIncome
     */
    public void addMonthlyIncome(Month month, MonthlyIncome monthlyIncome) {
        if (yearIncomes.containsKey(month)) {
            yearIncomes.replace(month, monthlyIncome);
        } else {
            yearIncomes.put(month, monthlyIncome);
        }
    }

    /**
     * If yearIncomes contains such month method delete monthly income from yearIncomes,
     * else method throw Exception.
     * @param month         month
     * @param monthlyIncome monthlyIncome
     */
    public void deleteMonthlyIncome(Month month, MonthlyIncome monthlyIncome) {
        if (yearIncomes.containsKey(month)) {
            yearIncomes.remove(month, monthlyIncome);
        } else {
            throw new NullPointerException();
        }
    }

    /**
     *
     * @return yearIncomes
     */
    public HashMap<Month, MonthlyIncome> getYearIncomes() {
        return yearIncomes;
    }

    public Double getAllYearIncomes() {
        Iterator<Map.Entry<Month, MonthlyIncome>> mapIterator = yearIncomes.entrySet().iterator();
        Double result = Double.valueOf(0);
        while (mapIterator.hasNext()) {
            Map.Entry<Month, MonthlyIncome> mapEntry = mapIterator.next();
            result += mapEntry.getValue().getSumOfIncomes();
        }
        return result;
    }

    public Double getAllYearTaxes() {
        Iterator<Map.Entry<Month, MonthlyIncome>> mapIterator = yearIncomes.entrySet().iterator();
        Double result = Double.valueOf(0);
        while (mapIterator.hasNext()) {
            Map.Entry<Month, MonthlyIncome> mapEntry = mapIterator.next();
            result += mapEntry.getValue().getSumOfTaxes();
        }
        return result;
    }

    @Deprecated
    public HashMap<Incomes, Double> addHashMap(HashMap<Incomes, Double> map1, HashMap<Incomes, Double> map2) {
        Iterator<Map.Entry<Incomes, Double>> map1Iterator = map1.entrySet().iterator();
        Iterator<Map.Entry<Incomes, Double>> map2Iterator = map2.entrySet().iterator();
        HashMap<Incomes, Double> result = new HashMap<>();

        while (map1Iterator.hasNext()) {
            Map.Entry<Incomes, Double> map1Entry = map1Iterator.next();
            Map.Entry<Incomes, Double> map2Entry = map2Iterator.next();

            if (map1Entry.getKey() == map2Entry.getKey()) {
                result.put(map1Entry.getKey(), map1Entry.getValue() + map2Entry.getValue());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "YearIncome:\n" +
                yearIncomes + "\n";
    }
}
