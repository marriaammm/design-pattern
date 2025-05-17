package com;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private boolean isAvailable;
    private User borrower;

    private List<Observer> observers = new ArrayList<>();

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            borrower = user;
            System.out.println(user.getName() + " borrowed " + title);
        } else {
            System.out.println(title + " is currently not available.");
            addObserver(user); 
            System.out.println(user.getName() + " will be notified when the book becomes available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println(borrower.getName() + " returned " + title);
            isAvailable = true;
            borrower = null;
            notifyObservers();
            observers.clear(); 
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Book '" + title + "' is now available.");
        }
    }
}
