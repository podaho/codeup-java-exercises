package products;
import java.util.Calendar;

public class Item extends Product{
    private boolean perishable;
    private boolean fragile;
    private int manufacturedYear;
    private int manufacturedMonth;

    public Item() {
        super();
        perishable = false;
        fragile = false;
        manufacturedYear = Calendar.getInstance().get(Calendar.YEAR);
        manufacturedMonth = Calendar.getInstance().get(Calendar.MONTH);
    }

    public Item(String name, double price, boolean perish, boolean frag, int yearMade, int monthMade) {
        super(name, price);
        perishable = perish;
        fragile = frag;
        manufacturedMonth = monthMade;
        manufacturedYear = yearMade;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perish) {
        this.perishable = perish;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getManufacturedMonth() {
        return manufacturedMonth;
    }

    public void setManufacturedMonth(int manufacturedMonth) {
        this.manufacturedMonth = manufacturedMonth;
    }
}
