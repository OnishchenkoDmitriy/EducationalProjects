package org.courses.model.enteties.income;

import org.courses.model.service.IncomesService;

import java.io.Serializable;
import java.util.*;

/**
 * The class describes all incomes in the month
 */
public class MonthlyIncome implements Serializable {

    /**
     * monthlyIncomes - describes type of income and its value
     */
    HashMap<Incomes, Double> monthlyIncomes = new HashMap<>();

    /**
     * monthlyTaxes - describes type of income and its tax value
     */
    HashMap<Incomes, Double> monthlyTaxes = new HashMap<>();

    /**
     * @see IncomesService
     */
    transient IncomesService service = new IncomesService();

    /**
     * Adds income to monthlyIncomes and monthlyTaxes.
     * If monthlyIncomes already contains such income, method replace old income to new income.
     *
     * @param value  income value
     * @param income type of income
     */
    public void addIncome(Double value, Incomes income) {
        if (monthlyIncomes.containsKey(income)) {
            monthlyIncomes.replace(income, value);
            monthlyTaxes.replace(income, service.getTax(value, income.getTaxValue()));
        } else {
            monthlyIncomes.put(income, value);
            monthlyTaxes.put(income, service.getTax(value, income.getTaxValue()));
        }
    }

    public HashMap<Incomes, Double> getMonthlyTaxes() {
        return monthlyTaxes;
    }

    public HashMap<Incomes, Double> getMonthlyIncomes() {
        return monthlyIncomes;
    }

    public HashMap<Incomes, Double> getSortedMonthlyTaxes() {
        return service.sort(monthlyTaxes);
    }

    public HashMap<Incomes, Double> getSortedMonthlyIncomes() {
        return service.sort(monthlyTaxes);
    }

    public Double getSumOfIncomes() {
        return service.getSumOfValues(monthlyIncomes);
    }

    public Double getSumOfTaxes() {
        return service.getSumOfValues(monthlyTaxes);
    }

    @Override
    public String toString() {
        return "incomes ===> " + monthlyIncomes + ";\n" +
                "taxes ===> " + monthlyTaxes + ".\n";
    }
}
