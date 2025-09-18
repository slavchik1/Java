public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.printf("Назва: %s, Автор: %s", title, author);
    }
}
