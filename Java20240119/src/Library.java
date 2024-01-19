import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        if (books.contains(book) ) {
            books.remove(book);
        } else {
            System.out.println("Немає вільного місця!");
        }
    }

    public void deleteBook(Book book) {
        for(Book book1 : books) {
            if (Objects.equals(book1, book)) {
                books.remove(book1);
            } else {
                System.out.println("Такої книги не існує!");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Книги:");
        books.forEach(builder::append);
        return builder.toString();
    }
}