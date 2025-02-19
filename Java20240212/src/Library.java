import java.util.ArrayList;


public class Library {
    private ArrayList<Book> Books;
    private ArrayList<Reader> Readers;
    private Reader voidReader = new Reader("", "", "", "", -1);

    public Library() {
        Books = new ArrayList<>();
        Readers = new ArrayList<>();
    }

    public void addNewBook(String name, String author, String date, String coverLink, String content, Reader owner) {
        Book Book = new Book(name, author, date, coverLink, content, owner);
        Books.add(Book);
        System.out.printf("Book %s by %s has added to the library", name, author);
    }

    public void addNewReader(String name, String sex, String gender, String photoLink, int age) {
        Reader Reader = new Reader(name, sex, gender, photoLink, age);
        Books.add(Reader);
        System.out.printf("%s, %s years old has added to the library", name, age);
    }

    public void booksList() {
        for (int i = 0; i < Books.size(); i++) {
            System.out.printf("%s by %s", Books[i].name, Books[i].author);
        }
    }

    public int findBook(String name) {
        for (int i = 0; i < Books.size(); i++) {
           if (Books[i].name == name) {
               System.out.printf("Book #%s have found", i);
               return i;
           }
        }
    }

    public void readrsList() {
        for (int i = 0; i < Readers.size(); i++) {
            System.out.printf("%s by %s", Readers[i].name, Readers[i].author);
        }
    }

    public void giveBook(String name, Reader owner) {
        Books[findBook(name)].owner = owner;
        Books[findBook(name)].status = true;
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
