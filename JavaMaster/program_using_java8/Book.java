package program_using_java8;
/*
print title of book publish after 2000
claculate total price of all book
find book with highest price
create new list with book price less than 40
    book contain title ,author,price ,year


 */
public class Book {
    String author ;
    int year ;
    double price ;
    String title;

    public Book(String author, int year, double price, String title) {
        this.author = author;
        this.year = year;
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
