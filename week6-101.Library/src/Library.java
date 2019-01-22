import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list;

    public Library() {
        this.list = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void printBooks() {
        for (Book book: list) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> returned = new ArrayList<Book>();
        for (Book book: list) {
            if (StringUtils.included(book.title(), title)) {
                returned.add(book);
            }
        }
        return returned;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> returned = new ArrayList<Book>();
        for (Book book: list) {
            if (StringUtils.included(book.publisher(), publisher)) {
                returned.add(book);
            }
        }
        return returned;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> returned = new ArrayList<Book>();
        for (Book book: list) {
            if (book.year() == year) {
                returned.add(book);
            }
        }
        return returned;
    }
}
