package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();

        Book book1 = BookFactory.createBook("default", "Harry Potter");
        Book book2 = BookFactory.createBook("physical", "Lord of the Rings");
        Book book3 = BookFactory.createBook("historical", "Outlander");

        book1 = new RareEditionDecorator(book1);
        book2 = new IllustratedDecorator(book2);
        book3 = new SignedCopyDecorator(book3);

        library.addBook(book1);
        library.addBook(book2);

        // Create users
        User john = new User("John", false);
        User alice = new User("Alice", true);

        library.borrowBook("Harry Potter [Rare Edition]", john);
        System.out.println("\n=============================");
        library.returnBook("Harry Potter [Rare Edition]");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings [Illustrated]", john);
        System.out.println("=============================");
        library.borrowBook("math", john);
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings [Illustrated]", alice);
        System.out.println("=============================");

        library.borrowBook("Outlander [Signed Copy]", alice);
        System.out.println("=============================");
        library.addBook(book3);
        library.borrowBook("Outlander [Signed Copy]", alice);
    }
}
