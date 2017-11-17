import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String response;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Say something to Bob!");
            response = sc.nextLine();
            if(response.endsWith("?")) {
                System.out.println("Bob says: \"Sure.\"");
            } else if(response.equals("")) {
                System.out.println("Bob says: \"Fine. Be that way!\"");
            } else if(response.equals(response.toUpperCase())) {
                System.out.println("Bob says: \"Whoa, chill out!\"");
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}
