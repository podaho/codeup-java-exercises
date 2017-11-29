package products;
import java.util.Calendar;

public class Service extends Product{
    private String recipientName;
    private int yearStarted;
    private int monthStarted;
    private int yearEnded;
    private int monthEnded;

    public Service() {
        super();
        recipientName = "Not Set";
        yearStarted = Calendar.getInstance().get(Calendar.YEAR);
        monthStarted = Calendar.getInstance().get(Calendar.MONTH);
        yearEnded = Calendar.getInstance().get(Calendar.YEAR);
        monthEnded = Calendar.getInstance().get(Calendar.MONTH);
    }

    public Service(String name, double price, String recipientName, int yearStarted, int monthStarted, int yearEnded, int monthEnded) {
        super(name, price);
        this.recipientName = recipientName;
        this.yearStarted = yearStarted;
        this.monthStarted = monthStarted;
        this.yearEnded = yearEnded;
        this.monthEnded = monthEnded;
    }

    @Override
    public void printProductDetails() {
        super.printProductDetails();
        System.out.println("Service Recipient: "+recipientName);
    }

    public void simplePrint() {
        super.printProductDetails();
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public int getMonthStarted() {
        return monthStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setMonthStarted(int monthStarted) {
        this.monthStarted = monthStarted;
    }

    public int getYearEnded() {
        return yearEnded;
    }

    public int getMonthEnded() {
        return monthEnded;
    }

    public void setYearEnded(int yearEnded) {
        this.yearEnded = yearEnded;
    }

    public void setMonthEnded(int monthEnded) {
        this.monthEnded = monthEnded;
    }
}
