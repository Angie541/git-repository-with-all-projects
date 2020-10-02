class Task {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.abbBook(new Book("Crime and Punishment", "Dostoevsky", "ABC", "Hardcover", 2013, 608, 8));
        lib.abbBook(new Book("Idiot", "Dostoevsky", "The Planet", "Paperback", 2013, 640, 12));
        lib.abbBook(new Book("The Headless Horseman", "Thomas Mayne Reid", "ABC", "Paperback", 2009, 430, 7));
        lib.abbBook(new Book("White Fang", "Jack London", "Illustrated Edition", "Hardcover", 2017, 252, 9));
        lib.abbBook(new Book("The Picture of Dorian Gray", "Oscar Wilde", "ABC", "Paperback", 2018, 265, 7));

        System.out.println("BooksByAuthor: ");
        lib.outputListOfBooksByAuthor("Dostoevsky");
        System.out.println(" ");
        System.out.println("BooksByPublisher: ");
        lib.outputListOfBooksByPublisher("ABC");
        System.out.println(" ");
        System.out.println("Books which was written before a given year: ");
        lib.outputListOfBooksWrittenBeforeAGivenYear(2013);
    }
}