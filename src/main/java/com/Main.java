package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();

        Book book1 = BookFactory.createBook("default", "Harry Potter");
        Book book2 = BookFactory.createBook("physical", "Lord of the Rings");
        Book book3 = BookFactory.createBook("historical", "Outlander");

        library.addBook(book1);
        library.addBook(book2);

        // Create users
        User john = new User("John", false);
        User alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john);
        System.out.printf("\n" + "=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", john);
        System.out.println("=============================");
        library.borrowBook("math", john);
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", alice);
        System.out.println("=============================");
        library.borrowBook("Outlander", alice);
        System.out.println("=============================");
        library.addBook(book3);
        library.borrowBook("Outlander", alice);
    }
}
