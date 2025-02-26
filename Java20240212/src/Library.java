import java.util.ArrayList;


public class Library {
    private ArrayList<Book> Books;
    private ArrayList<Reader> Readers;

    public Library() {
        Books = new ArrayList<>();
        Readers = new ArrayList<>();
    }

    public void addNewBook(String name, String author) {
        Book Book = new Book(name, author);
        Books.add(Book);
        System.out.printf("Book %s by %s has added to the library", name, author);
    }

    public void addNewReader(String name) {
        Reader Reader = new Reader(name);
        Readers.add(Reader);
        System.out.printf("%s has benn added to the library", name);
    }

    public void booksList() {
        for (Book book : Books) {
            System.out.printf("%s by %s\n", Books.name, Books.author);
        }
    }

    public void readrsList() {
        for (Reader reade : Readers) {
            System.out.printf("%s\n", Readers.name);
        }
    }

    public void giveBook(String name, Reader owner) {
        Books[/**/].owner = owner;
        Books[/**/].status = true;
    }

    public void returnBook(String name) {
        Books[findBook(name)].owner = voidReader;
    }

    public void givenBooksList(String name) {
        for (int i = 0; i < Books.size(); i++) {
            if (Books[i].owner == voidReader) {
                System.out.printf("%s by %s", Books[i].name, Books[i].author);
            }
        }
    }
}
