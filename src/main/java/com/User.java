package com;

public class User implements Observer {
    private String name;
    private boolean isPremium;
    private LendingStrategy lendingStrategy;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
        this.lendingStrategy = isPremium ? new PremiumLendingStrategy() : new NormalLendingStrategy();
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public LendingStrategy getLendingStrategy() {
        return lendingStrategy;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
