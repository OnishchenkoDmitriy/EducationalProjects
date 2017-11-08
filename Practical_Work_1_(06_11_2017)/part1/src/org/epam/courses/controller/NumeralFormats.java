package org.epam.courses.controller;

public enum NumeralFormats {
    BIN(2),
    OCT(8),
    HEX(16);

    private final int biteCapacity;

    NumeralFormats(int biteCapacity) {
        this.biteCapacity = biteCapacity;
    }

    public int getBiteCapacity() {
        return biteCapacity;
    }
}
