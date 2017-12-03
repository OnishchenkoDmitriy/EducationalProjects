package org.courses.controller.menu;

import org.courses.model.enteties.human.Human;
import org.courses.model.enteties.income.Incomes;
import org.courses.model.enteties.income.MonthlyIncome;
import org.courses.model.enteties.income.YearIncome;
import org.courses.view.textConstants.MenuConstants;
import org.courses.view.textConstants.TextConstants;
import org.courses.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

import static org.courses.controller.service.Utils.getStringValue;

/**
 * Abstract class Menu
 */
public abstract class Menu {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @see YearIncome
     * @param br bufferedReader
     * @return year income from reader
     * @throws IOException
     */
    YearIncome getYearIncomeFromReader(BufferedReader br) throws IOException {
        YearIncome yearIncome;
        yearIncome = new YearIncome();
        yearIncome.addMonthlyIncome(getMonthFromReader(br), getMonthlyIncomeMenu(br));
        return yearIncome;
    }

    /**
     * @param br bufferedReader
     * @return month by number
     * @throws IOException
     */
    Month getMonthFromReader(BufferedReader br) throws IOException {
        int monthValue = Integer.valueOf(getStringValue(br, TextConstants.Messages.ENTER_MONTH_VALUE, TextConstants.RegexContainer.REGEX_MONTH));
        return Month.of(monthValue);
    }

    /**
     * Creates monthly income from reader
     * @param br
     * @return monthlyIncome
     * @throws IOException
     */
    MonthlyIncome getMonthlyIncomeMenu(BufferedReader br) throws IOException {
        MonthlyIncome monthlyIncome = new MonthlyIncome();
        Incomes income = getIncomeFromReader(br);
        String incomeValue = getStringValue(br, TextConstants.Messages.ENTER_INCOME_VALUE, TextConstants.RegexContainer.REGEX_DOUBLE);
        monthlyIncome.addIncome(Double.valueOf(incomeValue), income);
        return monthlyIncome;
    }

    /**
     * @param br
     * @return income type inputted from reader
     * @throws IOException
     */
    private Incomes getIncomeFromReader(BufferedReader br) throws IOException {
        String inputString = getStringValue(br, TextConstants.Messages.CHOOSE_INCOME_TYPE, TextConstants.RegexContainer.REGEX_NUMBER);
        switch (inputString) {
            case MenuConstants.CreateTaxPayerConstants.MAIN_WORK_PLACE:
                return Incomes.MAIN_WORK_PLACE;
            case MenuConstants.CreateTaxPayerConstants.SECOND_WORK_PLACE:
                return Incomes.SECOND_WORK_PLACE;
            case MenuConstants.CreateTaxPayerConstants.AUTHOR_FEE:
                return Incomes.AUTHOR_FEE;
            case MenuConstants.CreateTaxPayerConstants.SALE_OF_PROPERTIES:
                return Incomes.SALE_OF_PROPERTIES;
            case MenuConstants.CreateTaxPayerConstants.GIFT_SUMS_AND_PROPERTIES:
                return Incomes.GIFT_SUMS_AND_PROPERTIES;
            case MenuConstants.CreateTaxPayerConstants.FROM_ABROAD:
                return Incomes.FROM_ABROAD;
            default:
                View.printMessageFromBundle(TextConstants.Messages.WRONG_INPUT);
                break;
        }
        return null;
    }


    /**
     * Creates human from reader
     * @param br bufferedReader
     * @return human
     * @throws IOException
     */
    Human getHumanFromReader(BufferedReader br) throws IOException {
        Human human = new Human();
        human.setName(getStringValue(br, TextConstants.Messages.ENTER_TAXPAYER_NAME, TextConstants.RegexContainer.REGEX_NAME));
        human.setBirthDate(getStringValue(br, TextConstants.Messages.ENTER_TAXPAYER_BIRTH_DATE, TextConstants.RegexContainer.REGEX_BIRTH_DATE));
        human.setGender(getGenderFromReader(br));
        return human;
    }

    /**
     * @param br bufferedReader
     * @return gender choose from reader
     * @throws IOException
     */
    private Human.Gender getGenderFromReader(BufferedReader br) throws IOException {
        String inputString = getStringValue(br, TextConstants.Messages.CHOOSE_GENDER, TextConstants.RegexContainer.REGEX_NUMBER).trim();
        if (inputString.equals(1)) return Human.Gender.MALE;
        return Human.Gender.FEMALE;
    }
}
