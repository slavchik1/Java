public class TextBook extends Book {
    String subject;

    public TextBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Предмет: %s", this.subject);
    }
}
