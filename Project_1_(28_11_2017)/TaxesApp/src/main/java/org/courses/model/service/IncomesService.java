package org.courses.model.service;

import org.courses.model.enteties.income.Incomes;

import java.util.*;

/**
 * Util for working with incomes
 */
public class IncomesService {

    /**
     * Calculate tax from income
     * @param income income value
     * @param tax tax value in percent
     * @return tax value
     */
    public double getTax(double income, double tax) {
        return income * (tax / 100);
    }

    /**
     * @param map hashMap
     * @return sum of each values in hashMap
     */
    public Double getSumOfValues( HashMap<Incomes, Double> map){
        Iterator<Map.Entry<Incomes, Double>> iterator = map.entrySet().iterator();
        Double result = Double.valueOf(0);
        while (iterator.hasNext()){
            result += iterator.next().getValue();
        }
        return result;
    }

    /**
     * Sort hashMap by value
     * @param map hashMap
     * @return sorted hashMap
     */
    public HashMap<Incomes, Double> sort(HashMap<Incomes, Double> map) {
        List<Map.Entry<Incomes, Double>> list = new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<Incomes, Double>>()
        {
            @Override
            public int compare(Map.Entry<Incomes, Double> o1, Map.Entry<Incomes, Double> o2)
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        HashMap<Incomes, Double> result = new LinkedHashMap<>();
        for (Map.Entry<Incomes, Double> entry : list)
        {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

}
