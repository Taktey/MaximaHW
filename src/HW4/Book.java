package HW4;

public class Book {
    String name;
    Author author;
    Integer year;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Book(String name, Author author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name is " + name + "\nAuthor is " + author + "Year is " + year + "\n";
    }
}
