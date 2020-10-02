import java.util.ArrayList;
import java.util.function.Function;
import jdk.nashorn.internal.codegen.CompilerConstants.Call;

@FunctionalInterface
interface Compare<ArgumentType, A2T, ReturnType> {
    ReturnType equal(ArgumentType obj, A2T obj2);
}

class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public Library() {
    }

    public void abbBook(Book book) {
        this.bookList.add(book);
    }

    private ArrayList<Book> findListOfBooks(Compare<Book, String, Boolean> compare) {
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : this.bookList) {
            if (compare.equal(book, "str-primer")) {
                result.add(book);
            }
        }
        return result;
    }

    private void outputListOfBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void outputListOfBooksByAuthor(String author) {
        ArrayList<Book> books = this.findListOfBooks((Book book, String arg2) -> book.getAuthor() == author);
        this.outputListOfBooks(books);
    }

    public void outputListOfBooksByPublisher(String publisher) {
        ArrayList<Book> books = this.findListOfBooks((Book book, String arg2) -> book.getPublisher() == publisher);
        this.outputListOfBooks(books);
    }

    public void outputListOfBooksWrittenBeforeAGivenYear(int yearOfPublication) {
        ArrayList<Book> books = this
                .findListOfBooks((Book book, String arg2) -> book.getYearOfPublication() < yearOfPublication);
        this.outputListOfBooks(books);
    }
}