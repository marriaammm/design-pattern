package com;

public class SignedCopyDecorator extends BookDecorator {

    public SignedCopyDecorator(Book book) {
        super(book);
    }

    @Override
    public String getTitle() {
        return decoratedBook.getTitle() + " [Signed Copy]";
    }
}
