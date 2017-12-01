package org.courses;

import org.courses.model.UnaryOperationsReflectionUtils;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        UnaryOperationsReflectionUtils utils = new UnaryOperationsReflectionUtils();

        utils.createUnaryOperation();
        System.out.println(utils.getUnaryOperation());

        utils.setValue(135.2);
        System.out.println(utils.getUnaryOperation());

        utils.increment();
        System.out.println(utils.getUnaryOperation());

        utils.decrement();
        System.out.println(utils.getUnaryOperation());
    }
}
