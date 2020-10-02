import java.util.UUID;

class Book {
    private String uid;
    private String name;
    private String author;
    private String publisher;
    private String typeOfBinding;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;

    public Book(String name, String author, String publisher, String typeOfBinding, int yearOfPublication,
            int numberOfPages, int price) {
        this.uid = UUID.randomUUID().toString();
        this.setName(name);
        this.author = author;
        this.publisher = publisher;
        this.typeOfBinding = typeOfBinding;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return String.format(
                "uid: %s\nname: %s\nauthor: %s\npublisher: %s\ntypeOfBinding: %s\nyearOfPublication: %d\nnumberOfPages: %d\nprice: %d\n",
                this.uid, this.name, this.author, this.publisher, this.typeOfBinding, this.yearOfPublication,
                this.numberOfPages, this.price);
    }
}