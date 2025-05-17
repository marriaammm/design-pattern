package com;

public class ExternalBookAdapter extends Book {
    private ExternalBook externalBook;

    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.getBookTitle());
        this.externalBook = externalBook;
    }

    @Override
    public boolean isAvailable() {
        return externalBook.isBorrowable();
    }

    @Override
    public void borrowBook(User user) {
        if (externalBook.isBorrowable()) {
            externalBook.setBorrowable(false);
            int days = user.getLendingStrategy().getLendingPeriod();
            System.out.println(user.getName() + " borrowed external book \"" + getTitle() + "\" for " + days + " days.");
        } else {
            System.out.println("External book \"" + getTitle() + "\" is not available.");
        }
    }

    @Override
    public void returnBook() {
        externalBook.setBorrowable(true);
        System.out.println("External book \"" + getTitle() + "\" has been returned.");
    }
}
