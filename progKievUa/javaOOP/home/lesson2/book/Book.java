package progKievUa.javaOOP.home.lesson2.book;

/**
 * Created by Alexander on 7/19/2016.
 */

public class Book {
    private static int nextId = 0;

    private final int id = nextId++;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublisher;
    private int amountOfPages;
    private int price;
    private String typeOfBinding;

    public Book(String name, String typeOfBinding, int price, int amountOfPages, int yearOfPublisher, String publisher, String author) {
        this.name = name;
        this.typeOfBinding = typeOfBinding;
        this.price = price;
        this.amountOfPages = amountOfPages;
        this.yearOfPublisher = yearOfPublisher;
        this.publisher = publisher;
        this.author = author;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfPublisher() {
        return yearOfPublisher;
    }

    public void setYearOfPublisher(int yearOfPublisher) {
        this.yearOfPublisher = yearOfPublisher;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }
}
