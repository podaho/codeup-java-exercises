package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string:");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String resp;
        do {
            System.out.println("Yes or No?");
            resp = this.scanner.next();
            if(resp.equalsIgnoreCase("y") || resp.equalsIgnoreCase("yes") || resp.equalsIgnoreCase("true") || resp.equalsIgnoreCase("t")) {
                return true;
            } else if(resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("no") || resp.equalsIgnoreCase("false") || resp.equalsIgnoreCase("f")) {
                return false;
            }
        } while(true);
    }

    public boolean yesNo(String prompt) {
        String resp;
        do {
            System.out.println(prompt);
            resp = this.scanner.next();
            if(resp.equalsIgnoreCase("y") || resp.equalsIgnoreCase("yes") || resp.equalsIgnoreCase("true") || resp.equalsIgnoreCase("t")) {
                return true;
            } else if(resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("no") || resp.equalsIgnoreCase("false") || resp.equalsIgnoreCase("f")) {
                return false;
            }
        } while(true);
    }

    public int getInt(int min, int max) {
        int retVal;
        do {
            System.out.printf("Enter an integer between %d and %d inclusive:\n", min, max);
            retVal = this.scanner.nextInt();
        } while(retVal < min || retVal > max);
        return retVal;
    }

    public int getInt(int min, int max, String prompt) {
        int retVal;
        do {
            System.out.println(prompt);
            retVal = this.scanner.nextInt();
        } while(retVal < min || retVal > max);
        return retVal;
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double retVal;
        do {
            System.out.printf("Enter an integer between %f and %f inclusive:\n", min, max);
            retVal = this.scanner.nextDouble();
        } while(retVal < min || retVal > max);
        return retVal;
    }

    public double getDouble(double min, double max, String prompt) {
        double retVal;
        do {
            System.out.println(prompt);
            retVal = this.scanner.nextDouble();
        } while(retVal < min || retVal > max);
        return retVal;
    }

    public double getDouble() {
        System.out.println("Enter a double:");
        return this.scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }
}
