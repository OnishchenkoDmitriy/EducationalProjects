package org.courses.model.enteties.taxpayer;

import org.courses.model.enteties.human.HumanToTaxpayer;
import org.courses.model.enteties.income.YearIncome;

import java.io.Serializable;

/**
 * Describes taxpayer
 */
public class Taxpayer implements Serializable{

    /**
     * @see HumanToTaxpayer
     */
    private HumanToTaxpayer human;

    /**
     * @see YearIncome
     */
    private YearIncome yearIncome;

    public void setHuman(HumanToTaxpayer human) {
        this.human = human;
    }
    public void setYearIncome(YearIncome yearIncome) {
        this.yearIncome = yearIncome;
    }

    public HumanToTaxpayer getHuman() {
        return human;
    }
    public YearIncome getYearIncome() {
        return yearIncome;
    }

    @Override
    public String toString() {
        return "Taxpayer{" +
                "human=" + human +
                ", yearIncome=" + yearIncome +
                '}';
    }
}
