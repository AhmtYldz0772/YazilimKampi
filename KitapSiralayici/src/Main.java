import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("İstanbul", "Mehmet", 540 , "01,01,2000"));
        books.add(new Book("Bela", "Selman ", 400 , "01,01,2000"));
        books.add(new Book("Hayır", "Ejder", 360 , "08,07,2013"));
        books.add(new Book("Hayat", "Ahmet", 100 , "05,06,2015"));
        books.add(new Book("Mayın", "Furkan", 190 , "01,05,1999"));

        for (Book book : books){
            System.out.println(book.getName());
        }

        System.out.println("\n-------------------\n");

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNo()- o2.getPageNo();
            }
        });

        books1.addAll(books);

        for (Book book: books1){
            System.out.println(book.getName());

        }
}
}