public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.log(378);
        logger2.log("ПОМИЛКА АААААА");
        logger3.log("ПОМИЛКА АААААА", 378);
    }
}
