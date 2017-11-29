package products;

import java.util.Calendar;

public class Subscription extends Product{
    private String recipientName;
    private String renewalType;
    private int yearBegin;
    private int monthBegin;
    private int yearTerminated;
    private int monthTerminated;

    public Subscription() {
        super();
        recipientName = "Not Set";
        renewalType = "PPA";
        yearBegin = Calendar.getInstance().get(Calendar.YEAR);
        monthBegin = Calendar.getInstance().get(Calendar.MONTH);
        yearTerminated = Calendar.getInstance().get(Calendar.YEAR);
        monthTerminated = Calendar.getInstance().get(Calendar.MONTH);
    }

    public Subscription(String name, double price, String recip, String renewType, int yearB, int monthB, int yearT, int monthT) {
        super(name, price);
        recipientName = recip;
        renewalType = renewType;
        yearBegin = yearB;
        monthBegin = monthB;
        yearTerminated = yearT;
        monthTerminated = monthT;
    }

    @Override
    public void printProductDetails() {
        super.printProductDetails();
        System.out.println("Subscription Recipient: "+recipientName+"\nRenewal Type: "+renewalType);
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

    public String getRenewalType() {
        return renewalType;
    }

    public void setRenewalType(String renewalType) {
        this.renewalType = renewalType;
    }

    public int getYearBegin() {
        return yearBegin;
    }

    public void setYearBegin(int yearBegin) {
        this.yearBegin = yearBegin;
    }

    public int getMonthBegin() {
        return monthBegin;
    }

    public void setMonthBegin(int monthBegin) {
        this.monthBegin = monthBegin;
    }

    public int getYearTerminated() {
        return yearTerminated;
    }

    public void setYearTerminated(int yearTerminated) {
        this.yearTerminated = yearTerminated;
    }

    public int getMonthTerminated() {
        return monthTerminated;
    }

    public void setMonthTerminated(int monthTerminated) {
        this.monthTerminated = monthTerminated;
    }
}
