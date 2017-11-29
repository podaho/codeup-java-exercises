package products;
import util.Input;

import java.util.ArrayList;
import java.util.Calendar;

public class ProductTester {
    private static ArrayList<Product> product = new ArrayList();

    public static Product addProduct(String productType) {
        Input inp = new Input();
        Product newProd;
        switch(productType) {
            case "Item":
                newProd = new Item(
                    inp.getString("Enter Item Name:"),
                    inp.getDouble("Enter Item Price:"),
                    inp.yesNo("Perishable Item?"),
                    inp.yesNo("Fragile Item?"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.YEAR),"Enter Year Made"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.MONTH),"Enter Month Made")
                );
                break;
            case "Service":
                newProd = new Service(
                    inp.getString("Enter Service Name:"),
                    inp.getDouble("Enter Service Price:"),
                    inp.getString("Enter Service Recipient Name:"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.YEAR),"Enter Year Started"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.MONTH),"Enter Month Started"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.YEAR),"Enter Year Completed"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.MONTH),"Enter Month Completed")
                );
                break;
            case "Subscription":
                newProd = new Subscription(
                    inp.getString("Enter Subscription Name:"),
                    inp.getDouble("Enter Subscription Price:"),
                    inp.getString("Enter Subscription Recipient Name:"),
                    inp.getString("Enter Renewal Type (Annual, Monthly, etc.):"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.YEAR),"Enter Year Subscription Started"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.MONTH),"Enter Month Subscription Started"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.YEAR),"Enter Year Subscription Ended"),
                    inp.getInt(0, Calendar.getInstance().get(Calendar.MONTH),"Enter Month Subscription Ended")
                );
                break;
            default:
                newProd = new Product();
        }
        product.add(newProd);
        System.out.println("New Product Added\n-------------------------------------------------------------------------");
        newProd.printProductDetails();
        return newProd;
    }

    public static void printProducts() {
        System.out.println("Printing Product Details\n-------------------------------------------------------------------------");
        for(Product prod : product) {
            prod.printProductDetails();
            System.out.println("-------------------------------------------------------------------------");
        }
    }

    public static int productCount() {
        return product.size();
    }

    public static void main(String[] args) {
        Product prod1 = addProduct("Item");
        Product prod2 = addProduct("Service");
        Product prod3 = addProduct("Subscription");
        System.out.println("I have "+Product.numberOfProductsIHave+" products right now.");
        printProducts();
    }
}
