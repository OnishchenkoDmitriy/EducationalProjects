package org.epam.courses.controller;

import org.epam.courses.model.EquilateralTriangle;
import org.epam.courses.view.View;

import java.util.Scanner;

public class Controller {
    private EquilateralTriangle triangle;
    private View view;

    public Controller() {
        view = new View();
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        triangle = new EquilateralTriangle(Utilities.inputIntValueWithScanner(sc, view));
        view.printArrayWithoutZero(triangle.getTriangleArray());
    }
}
