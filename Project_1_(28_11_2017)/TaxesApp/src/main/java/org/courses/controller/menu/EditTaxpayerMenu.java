package org.courses.controller.menu;

import org.courses.controller.exception.StopInputException;
import org.courses.controller.service.Utils;
import org.courses.model.enteties.taxpayer.Taxpayer;
import org.courses.model.enteties.taxpayer.TaxpayersBase;
import org.courses.view.View;

import static org.courses.view.textConstants.TextConstants.*;
import static org.courses.view.textConstants.MenuConstants.*;

import java.io.IOException;

public class EditTaxpayerMenu extends Menu{

    TaxpayersBase taxpayersBase;

    public EditTaxpayerMenu(TaxpayersBase taxpayersBase) {
        this.taxpayersBase = taxpayersBase;
    }

    public void run() throws IOException {
        try{
            String taxpayerName = Utils.getStringValue(br,  Messages.ENTER_TAXPAYER_NAME, RegexContainer.REGEX_NAME);
            Taxpayer taxpayer = taxpayersBase.getByName(taxpayerName);

            String inputtedValue = Utils.getStringValue(br, Messages.EDIT_TAXPAYER_MENU, RegexContainer.REGEX_NUMBER);
            switch (inputtedValue){
                case EditTaxPayerConstants.ADD_MONTHLY_INCOME:
                    taxpayer.getYearIncome().addMonthlyIncome(getMonthFromReader(br), getMonthlyIncomeMenu(br));
                    break;
                case EditTaxPayerConstants.DELETE_MONTHLY_INCOME:
                    taxpayer.getYearIncome().deleteMonthlyIncome(getMonthFromReader(br), getMonthlyIncomeMenu(br));
                    break;
                case EditTaxPayerConstants.SHOW_SUM_OF_INCOMES:
                    View.printMessageFromBundle(Messages.INCOMES_IN_THE_YEAR);
                    System.out.println(taxpayer.getYearIncome().getAllYearIncomes());
                    break;
                case EditTaxPayerConstants.SHOW_SUM_OF_TAXES:
                    View.printMessageFromBundle(Messages.TAXES_IN_THE_YEAR);
                    System.out.println(taxpayer.getYearIncome().getAllYearTaxes());
                    break;
                case EditTaxPayerConstants.EXIT:
                    return;
            }
        }catch (StopInputException e){
            return;
        }

    }
}
