package com.company;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int nr1, int nr2) {
        return nr1 * nr2;
    }
}
