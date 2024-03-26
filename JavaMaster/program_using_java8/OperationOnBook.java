package program_using_java8;
/*

print title of book publish after 2000
calculate total price of all book
find book with highest price
create new list with book price less than 40l
    book contain title ,author,price ,year

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperationOnBook {

    public static void main(String[] args) {
        Book book1=new Book("palalvi",2000,1290,"java");
        Book book2=new Book("sachin",1345,40,"python");
        Book book3=new Book("sanvi",473,30,"kafka");
        Book book4=new Book("sagar",2000,12,"rest api");


        List<Book> book=new ArrayList<>();
        //String author, int year, double price, String title
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
       returnTitleOfBook(book);
        priceOfAllBook(book);
        highestPrice(book);
        priceless(book);
    }

    private static void returnTitleOfBook(List<Book> book) {
      List<Book> titlebook=  book.stream().filter(book1->book1.getYear()>=2000).collect(Collectors.toList());
        for(Book b: titlebook)
        {
            System.out.println(b.getTitle());
        }
    }

    private static void priceOfAllBook(List<Book> book) {

       double sum= book.stream().mapToDouble(Book::getPrice).sum();
        System.out.println(sum);

    }

    private static void highestPrice(List<Book> book) {

      Optional<Book> b=book.stream().max((book1, book2)->Double.compare(book1.getPrice(),book2.getPrice()));
        System.out.println(b);
    }
    private static void priceless(List<Book> book) {

      List<Book> books= book.stream().filter(b->b.getPrice()<40).collect(Collectors.toList());
        //System.out.println(b);
        for(Book k:books)
        {
            System.out.println(k);
        }
    }


}
