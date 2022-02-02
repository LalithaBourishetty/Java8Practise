package com.modernjava.lambda;

class IncrementByFiveImplTraditional implements IncrementByFive{

    @Override
    public int incrementByFive(int inputValue) {
        return inputValue+5;
    }
}

public class IncrementByFiveImpl {
    public static void main(String[] args) {
        IncrementByFiveImplTraditional incrementByFiveImplTraditional = new IncrementByFiveImplTraditional();
        System.out.println("traditional Implementation "+incrementByFiveImplTraditional.incrementByFive(6));

        IncrementByFive incrementByFive= (a)->a+5;
        System.out.println("lambda Implementation "+incrementByFive.incrementByFive(6));
    }
}
