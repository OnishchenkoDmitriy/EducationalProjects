package model;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MonthlyIncomeTest {

   /* public MonthlyIncome monthlyIncome;
    public double delta;

    @Parameterized.Parameter
    public double income;
    @Parameterized.Parameter(1)
    public double expectedTax;
    @Parameterized.Parameter(2)
    public double percent;


    @Parameterized.Parameters(name = "{index}: {0}-income; {1}-expected tax; {2}-percent ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {135.8, 6.79, 5},
                {589.476, 58.9476, 10},
                {5777.47, 866.6205, 15},
                {26.3587, 5.27174, 20}
        });
    }

    @Before
    public void init(){

        monthlyIncome = new MonthlyIncome();

        monthlyIncome.setMainWorkPlaceIncome(1523.89);
        monthlyIncome.setSecondWorkPlaceIncome(14778.23);
        monthlyIncome.setAuthorFeeIncome(114.25);
        monthlyIncome.setFromAbroadIncome(1142.14);
        monthlyIncome.setGiftSumsAndProperties(11);

        delta = 0.01;
    }

    @Test
    public void getTaxTest(){
        double actualTax = monthlyIncome.getTax(income, percent);
        String message = actualTax + " <===> " + expectedTax;
        System.out.println(message);
        assertEquals(message ,expectedTax, actualTax, delta);
    }

    @Test
    public void getSortedTaxesTest(){
        System.out.println(monthlyIncome.getSortedTaxes());
    }*/



}
