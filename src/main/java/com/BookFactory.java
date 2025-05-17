package com;

public class BookFactory {
    public static Book createBook(String type, String title) {
        switch (type.toLowerCase()) {
            case "physical":
                return new PhysicalBook(title);
            case "historical":
                return new HistoricalBook(title);
            default:
                return new Book(title);
        }
    }
}
