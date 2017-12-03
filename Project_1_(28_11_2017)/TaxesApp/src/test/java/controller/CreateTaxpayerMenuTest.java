package controller;

import org.courses.controller.menu.CreateTaxpayerMenu;
import org.junit.Test;

import java.io.IOException;

public class CreateTaxpayerMenuTest {

    CreateTaxpayerMenu createTaxpayerMenu = new CreateTaxpayerMenu();

    @Test
    public void createTaxpayerMenuTest(){
        try {
            createTaxpayerMenu.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
