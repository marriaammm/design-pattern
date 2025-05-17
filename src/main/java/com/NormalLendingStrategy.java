package com;

public class NormalLendingStrategy implements LendingStrategy {
    @Override
    public int getLendingPeriod() {
        return 7;
    }
}
