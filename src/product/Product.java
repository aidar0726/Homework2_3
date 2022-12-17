package product;

public class Product {

    private String title;
    private Integer price;
    private Integer weight;

    private boolean purchasedProduct;

    public Product(String title, Integer price, Integer weight) {

        if (title == null || title.isBlank() || title.isEmpty()) {
            System.out.println("Заполните карточку товара полностью");
        } else {
            this.title = title;
        }
        if (price == null || price <= 0) {
            System.out.println("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }

        if (weight == null || weight <= 0) {
            System.out.println("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(Boolean purchasedProduct) {
        if (purchasedProduct == null) {
            System.out.println("Укажите значение");
        } else {
            this.purchasedProduct = purchasedProduct;
        }
    }


}
