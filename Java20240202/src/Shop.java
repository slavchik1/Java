public class Shop {
    private Product[] products = new Product[10];
    private int spaceAviable = products.length;

    public void addProduct(Product product) {
        if(spaceAviable <= 0) {
            System.out.println("Немає вільного місця!");
            return;
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
            }
        }
        System.out.printf("Продукт %s додано успішно", product.getName());
    }
}
