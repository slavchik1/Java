public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Дродж Урвелл");
        Book b2 = new Book("Пригоди Тома Соєра", "Марк Твен");
        Book b3 = new Book("Мавка: Лісова Пісня", "Леся Українка");

        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());
    }
}
