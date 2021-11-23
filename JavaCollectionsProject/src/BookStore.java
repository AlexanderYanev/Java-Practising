import java.util.*;

public class BookStore {
    private String address;
    private int area;
    private List<Book> bookList;


    /************* Constructors *************/

    public BookStore() {

    }

    public BookStore(String address, int area) {
        this.address = address;
        this.area = area;
        bookList = new ArrayList(10);
    }



    /************* Getters *************/

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public List<Book> getBookList() {
        return bookList;
    }

  /************* Interface *************/

    public boolean addBook(Book el) {
        return bookList.add(el);
    }

    public void removeBook(Book el) {
        boolean res = bookList.remove(el);
        if(res) {
            System.out.print(el.getName());
            System.out.println(" removed successfully.");
        }
        else {
            System.out.println("Removal failed.");
        }

    }

    public void printBooks() {
        if(bookList.isEmpty()) {
            System.out.println("No books to print!");
        }
        Iterator<Book> it = bookList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getName() + " ");
        }
    }
    /************* Sorting functions *************/

    public void sortBooksByName() {
        Collections.sort(bookList, Book.BookNameComparator);
    }

    public void sortBooksByPrice() {
        Collections.sort(bookList, Book.BookPriceComparator);
    }

    public void sortByTypeThanByPrice() {
        Collections.sort(bookList, Book.BookGenreComparator
                .thenComparing(Book.BookPriceComparator));
    }

    /************* Additional tasks *************/

    public void printMostExpensiveBook() {
        sortBooksByPrice();
        System.out.println(bookList.get(bookList.size()-1).getName());
    }

    public void printLastBookSortedByNames() {
        sortBooksByName();
        System.out.println(bookList.get(bookList.size()-1).getName());
    }

}
