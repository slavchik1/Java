public class Main {
    public static void main(String[] args) {
        Cryptocurrency cryptocurrency = new Cryptocurrency("Bitcoin", 1518305.19, 100);
        System.out.println(Cryptocurrency.calculateTotalPrice(new Cryptocurrency[]{cryptocurrency, new Cryptocurrency("Etherium", 83584.83, 10)}));
    }
}