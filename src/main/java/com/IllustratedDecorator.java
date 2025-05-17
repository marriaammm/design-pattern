package com;

public class IllustratedDecorator extends BookDecorator {

    public IllustratedDecorator(Book book) {
        super(book);
    }

    @Override
    public String getTitle() {
        return decoratedBook.getTitle() + " [Illustrated]";
    }
}
