package org.courses.model;

public class UnaryOperation {

    private double value;

    public UnaryOperation(double value) {
        this.value = value;
    }

    public UnaryOperation() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

    public void changeValue(){
        value *= -1;
    }

    @Override
    public String toString() {
        return "UnaryOperation{" +
                "value=" + value +
                '}';
    }
}
