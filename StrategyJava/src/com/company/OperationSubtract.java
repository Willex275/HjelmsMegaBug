package com.company;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int nr1, int nr2) {
        return nr1 - nr2;
    }
}
