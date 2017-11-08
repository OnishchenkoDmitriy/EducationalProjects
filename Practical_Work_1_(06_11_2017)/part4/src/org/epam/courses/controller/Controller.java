package org.epam.courses.controller;

import org.epam.courses.model.RandomMatrix;
import org.epam.courses.view.View;

import java.util.Scanner;

public class Controller {

    RandomMatrix matrixGenerator;
    View view;

    public Controller() {
        this.view = new View();
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        matrixGenerator = new RandomMatrix(Utilities.inputIntValueWithScanner(sc, view));
        matrixGenerator.generateRandomMatrix();
        matrixGenerator.generateTurnedMatrix();

        view.printResults(matrixGenerator.getRandomMatrix(), matrixGenerator.getTurnedMatrix());
    }
}
