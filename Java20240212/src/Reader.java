import java.util.ArrayList;


public class Reader {
    private ArrayList<Book> ownedBooks;
    private String name;

    public Reader(String name) {
        this.name = name;
        this.ownedBooks = new ArrayList<>();
    }
}
