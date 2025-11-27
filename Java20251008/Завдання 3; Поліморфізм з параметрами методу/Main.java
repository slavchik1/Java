public class Main {
    public static void printFigureInfo(Figure fig) {
        System.out.println("Інформація про фігуру:");
        fig.draw();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        Square square = new Square();

        printFigureInfo(circle);
        printFigureInfo(square);
    }
}
