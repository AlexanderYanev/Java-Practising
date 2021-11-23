import java.util.*;



public class Book {
    private String name;
    private int price;
    private String genre;

    /************* Constructors *************/

    public Book() {

    }

    public Book(String name, int price, String genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }


    /************* Comparator declaration *************/

    public static Comparator<Book> BookNameComparator = new Comparator<Book>() {
        public int compare(Book lhs, Book rhs) {
            return lhs.name.compareTo(rhs.name);
        }
    };

    public static Comparator<Book> BookPriceComparator = new Comparator<Book>() {
        public int compare(Book lhs, Book rhs) {
            return Integer.compare(lhs.price,rhs.price);
        }
    };

    public static Comparator<Book> BookGenreComparator = new Comparator<Book>() {
        public int compare(Book lhs, Book rhs) {
            return lhs.genre.compareTo(rhs.genre);
        }
    };







}
