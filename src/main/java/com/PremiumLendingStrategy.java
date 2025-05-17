package com;

public class PremiumLendingStrategy implements LendingStrategy {
    @Override
    public int getLendingPeriod() {
        return 30;
    }
}
