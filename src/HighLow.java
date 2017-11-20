import java.util.Scanner;

public class HighLow {
    public static int userGuess() {
        Scanner sc = new Scanner(System.in);
        int resp;
        do{
            System.out.println("Guess the number from 1-100:");
            resp = sc.nextInt();
        } while(resp < 1 && resp > 100);
        return resp;
    }

    public static void main(String[] args) {
        int num = (int) Math.floor(Math.random()*100)+1;
        int userInput;
        int numGuesses = 0;
        System.out.println("Game Generated Random Number! You have 5 guesses!\n");
        //System.out.printf("/////Debug: %d\n", num);
        do {
            userInput = userGuess();
            if(userInput > num) {
                System.out.printf("The game number is lower than that...\nThat was guess #%d\n\n", numGuesses+1);
            } else if(userInput < num) {
                System.out.printf("The game number is higher than that...\nThat was guess #%d\n\n", numGuesses+1);
            } else {
                System.out.printf("GOOD GUESS!! The number is %d\nYOU WIN!!!!\n\n", num);
                break;
            }
            numGuesses += 1;
            if(numGuesses == 5) {
                System.out.printf("That was your last guess... The correct answer is %d\n", num);
                break;
            }
        } while(userInput != num);
    }
}
