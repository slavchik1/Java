public class Cryptocurrency {
    private String name;
    private double price;
    private static long circutlatingSupply;

    public Cryptocurrency(String name, double price, long circ) {
        this.name = name;
        this.price = price;
        circutlatingSupply = circ;
    }

    public static double calculateTotalPrice(Cryptocurrency[] cryptocurrencies) {
        double result = 0;
        for (Cryptocurrency curr : cryptocurrencies) {
            result += curr.price * circutlatingSupply;
        }

        return result;
    }
}