package products;

public class Product {
    protected static int numberOfProductsIHave = 0;
    protected String productName;
    protected double productPrice;

    public Product() {
        numberOfProductsIHave++;
        productName = "No Name Set";
        productPrice = 0.0;
    }

    public Product(String name, double price) {
        numberOfProductsIHave++;
        productName = name;
        productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String newName) {
        productName = newName;
    }

    public void setProductPrice(double newPrice) {
        productPrice = newPrice;
    }

    public void printProductDetails() {
        System.out.println("Name: "+productName+"\nPrice: $"+productPrice);
    }
}
