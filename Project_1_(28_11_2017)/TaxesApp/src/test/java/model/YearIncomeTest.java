package model;

import org.courses.model.enteties.income.Incomes;
import org.courses.model.enteties.income.MonthlyIncome;
import org.courses.model.enteties.income.YearIncome;
import org.courses.model.service.IncomesService;
import org.junit.Before;
import org.junit.Test;

import java.time.Month;

public class YearIncomeTest {

  /*  private MonthlyIncome augustIncome;
    private MonthlyIncome septemberIncome;
    private YearIncome income2017;

    @Before
    public void init(){
        augustIncome = new MonthlyIncome();
        augustIncome.addIncome(Incomes.AUTHOR_FEE, 20000d);
        augustIncome.addIncome(Incomes.FROM_ABROAD, 35.24);
        augustIncome.addIncome(Incomes.GIFT_SUMS_AND_PROPERTIES, 100.3);
        augustIncome.addIncome(Incomes.SECOND_WORK_PLACE, 47447.1);

        septemberIncome = new MonthlyIncome();
        septemberIncome.addIncome(Incomes.AUTHOR_FEE, 3000d);
        septemberIncome.addIncome(Incomes.FROM_ABROAD, 85.24);
        septemberIncome.addIncome(Incomes.GIFT_SUMS_AND_PROPERTIES, 18.3);
        septemberIncome.addIncome(Incomes.SECOND_WORK_PLACE, 474.1);

        income2017 = new YearIncome();
        income2017.addMonthlyIncome(Month.AUGUST, augustIncome);
        income2017.addMonthlyIncome(Month.SEPTEMBER, septemberIncome);

    }

    @Test
    public void addHashMapTest(){
        System.out.println(augustIncome.getSortedMonthlyIncomes());
        System.out.println(septemberIncome.getSortedMonthlyIncomes());
        System.out.println(income2017.addHashMap(augustIncome.getMonthlyIncomes(), septemberIncome.getMonthlyIncomes()));
    }

    @Test
    public void getAllYearIncomesAndTaxesTest(){
        System.out.println("Incomes by year: " + income2017.getAllYearIncomes());
        System.out.println("Taxes by year: " + income2017.getAllYearTaxes());
    }

    @Test
    public void getSumOfValues(){
        IncomesService service = new IncomesService();
        System.out.println(service.getSumOfValues(augustIncome.getMonthlyIncomes()));
    }

*/





}
