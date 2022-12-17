package product;
import java.util.HashSet;
import java.util.Set;

public class  ProductMethod {

    public static  void addsProduct(Product product,Set<Product> products) throws ProductDuplicateException {
        if(!products.contains(product)) {
            products.add(product);
        } else {
            throw new ProductDuplicateException("Данный продукт уже имеется!");
        }

        System.out.println(products.size());
    }

    public static void removeProduct (Product product,Set<Product> products) {
        if(products.contains(product)) {
            products.remove(product);
        } else {
            System.out.println("В корзине нет продукта");
        }

        System.out.println(products.size());
    }

    public static void checkBoughtProduct(Product product) {
        product.setPurchasedProduct(true);
        System.out.println("Товар " + product.getTitle() + " отмечен как купленный");
    }
}
