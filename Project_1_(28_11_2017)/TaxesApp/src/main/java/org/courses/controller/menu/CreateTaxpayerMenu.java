package org.courses.controller.menu;

import org.courses.model.enteties.taxpayer.Taxpayer;

import java.io.IOException;

public class CreateTaxpayerMenu extends Menu{

    public Taxpayer run() throws IOException {
        Taxpayer taxpayer = new Taxpayer();
        try{
            taxpayer.setHuman(getHumanFromReader(br));
            taxpayer.setYearIncome(getYearIncomeFromReader(br));
            return taxpayer;
        }catch (IOException e){
            System.out.println(e.getMessage());
            taxpayer = null;
        }
        System.out.println(taxpayer);
        return null;
    }



}
