package com.company;

public class StrategyPatternDemo {


    public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
        System.out.println("20 + 10 = " + context.executeStrategy(20,10));



        context = new Context(new OperationSubtract());
        System.out.println("20 - 10 = " + context.executeStrategy(20,10));

        context = new Context(new OperationMultiply());
        System.out.println("20 * 10 = " + context.executeStrategy(20,10));


    }
}


