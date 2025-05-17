package com;

public class RareEditionDecorator extends BookDecorator {

    public RareEditionDecorator(Book book) {
        super(book);
    }

    @Override
    public String getTitle() {
        return decoratedBook.getTitle() + " [Rare Edition]";
    }
}
