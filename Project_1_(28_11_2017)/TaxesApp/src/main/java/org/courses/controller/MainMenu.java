package org.courses.controller;

import static org.courses.view.textConstants.TextConstants.*;
import static org.courses.view.textConstants.MenuConstants.*;

import org.courses.controller.exception.StopInputException;
import org.courses.controller.menu.CreateTaxpayerMenu;
import org.courses.controller.menu.EditTaxpayerMenu;
import org.courses.controller.service.FileSaver;
import org.courses.controller.service.Utils;
import org.courses.model.enteties.taxpayer.TaxpayersBase;
import org.courses.view.ResourceManager;
import org.courses.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainMenu {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private FileSaver fileSaver = new FileSaver();
    private TaxpayersBase taxpayersBase = new TaxpayersBase();
    private ResourceManager resourceManager = ResourceManager.INSTANCE;

    {
        br = new BufferedReader(new InputStreamReader(System.in));
        fileSaver = new FileSaver();
        taxpayersBase = new TaxpayersBase();
        resourceManager = ResourceManager.INSTANCE;
    }

    public void run() {
        fileSaver.checkFile();
        try {
            taxpayersBase.setTaxpayerList((List) fileSaver.getTaxpayersFromFile());
            resourceManager.changeResource(Utils.getStringValue(br, Messages.CHOOSE_LANGUAGE,
                    RegexContainer.REGEX_LANGUAGES));
            mainMenu();
        } catch (StopInputException | IOException e) {
            fileSaver.saveTaxpayerToFile(taxpayersBase.getTaxpayerList());
            View.printMessageFromBundle(Messages.GOOD_BUY);
        }
    }

    private void mainMenu() throws IOException, StopInputException {
        View.printMessageFromBundle(Messages.WELCOME);
        while (true) {
            String inputtedValue = Utils.getStringValue(br, Messages.USER_MENU, RegexContainer.REGEX_NUMBER);
            switch (inputtedValue) {
                case MainMenuConstants.SHOW_TAXPAYERS:
                    View.displayTaxpayerBase(taxpayersBase);
                    break;
                case MainMenuConstants.EDIT_TAXPAYER:
                    new EditTaxpayerMenu(taxpayersBase).run();
                    break;
                case MainMenuConstants.ADD_TAXPAYER:
                    taxpayersBase.add(new CreateTaxpayerMenu().run());
                    break;
                case MainMenuConstants.DELETE_TAXPAYER:
                    taxpayersBase.remove(Utils.getStringValue(br, Messages.ENTER_TAXPAYER_NAME, RegexContainer.REGEX_NAME));
                    break;
                case MainMenuConstants.EXIT:
                    throw new StopInputException();
                default:
                    View.printMessageFromBundle(Messages.WRONG_INPUT);
                    break;
            }
        }
    }
}



