package org.courses.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UnaryOperationsReflectionUtils {

    UnaryOperation unaryOperation;
    Class<?> clazz = UnaryOperation.class;

    public UnaryOperation getUnaryOperation() {
        return unaryOperation;
    }

    public void createUnaryOperation() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> constructor = clazz.getConstructor(double.class);
        unaryOperation = (UnaryOperation) constructor.newInstance(50);
    }

    public void setValue(double value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method setValueTest = clazz.getMethod("setValue", double.class);
        setValueTest.invoke(unaryOperation, value);
    }

    public void increment() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method incrementTest = clazz.getMethod("increment");
        incrementTest.invoke(unaryOperation);
    }

    public void decrement() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method decrementTest = clazz.getMethod("decrement");
        decrementTest.invoke(unaryOperation);
    }

    public void changeValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method changeValueTest = clazz.getMethod("changeValue");
        changeValueTest.invoke(unaryOperation);
    }

    public double getValue() throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        return field.getDouble(unaryOperation);
    }




}
