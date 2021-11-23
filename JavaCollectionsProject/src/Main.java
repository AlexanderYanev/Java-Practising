import java.util.*;

/* author - Yanev, f102122 */

public class Main {


    public static void main(String[] args) {

        Book b1 = new Book("Lupin", 25, "novel");
        Book b2 = new Book("The Witcher", 20, "novel");
        Book b3 = new Book("Vazov's book of poems", 50, "book of poetry");
        Book b4 = new Book("Reapers", 15, "story");



        BookStore nbu = new BookStore("Montevideo", 4200);

        nbu.addBook(b1);
        nbu.addBook(b2);
        nbu.addBook(b3);
        nbu.addBook(b4);

        nbu.printBooks();

        nbu.sortBooksByName();

        nbu.printBooks();

        nbu.sortBooksByPrice();

        nbu.printBooks();

        nbu.printMostExpensiveBook();



    }
}
