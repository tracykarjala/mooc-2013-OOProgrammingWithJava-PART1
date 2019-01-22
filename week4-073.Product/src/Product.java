public class Product {
    private String name;
    private int amount;
    private double price;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.amount = amountAtStart;
        this.price = priceAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
