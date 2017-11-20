import java.util.Scanner;

public class MethodsExercises {
    public static int addStuff(int x, int y) {
        return x+y;
    }

    public static int subtractStuff(int x, int y) {
        return x-y;
    }

    public static int multiplyStuff(int x, int y) {
        int retVal = 0;
        for(int i = 0; i < x; i++) {
            retVal += y;
        }
        return retVal;
    }

    public static int recursiveMultiplyStuff(int x, int y) {
        return recursiveMultiplyHelper(0, x, y);
    }

    public static int recursiveMultiplyHelper(int acc, int x, int count) {
        if(count > 0) {
            return recursiveMultiplyHelper(acc+x, x, --count);
        } else {
            return acc;
        }
    }

    public static int divideStuff(int x, int y) {
        if(y <= 0) {
            return -1;
        }
        return x/y;
    }

    public static int modulusStuff(int x, int y) {
        return x%y;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int resp = sc.nextInt();
        if(resp >= min && resp <= max) {
            return resp;
        }
        System.out.printf("Enter a number between %d to %d:\n", min, max);
        return getInteger(min, max);
    }

    public static void factorialStuff() {
        int cont = 1;
        do {
            System.out.println("Enter an integer from 1 to 20");
            int userInput = getInteger(1, 20);
            long retVal = 1L;
            for(int i = userInput; i > 0; i--) {
                retVal *= i;
            }
            System.out.println(retVal);
            System.out.println("Would you like to continue? 0) No  1) Yes");
            cont = getInteger(0, 1);
        } while(cont == 1);
    }

    public static void recursiveFactorialStuff() {
        int cont = 1;
        do {
            System.out.println("Enter an integer from 1 to 20");
            int userInput = getInteger(1, 20);
            System.out.println(recursiveFactorialHelper(userInput, 1));
            System.out.println("Would you like to continue? 0) No  1) Yes");
            cont = getInteger(0, 1);
        } while(cont == 1);
    }

    public static long recursiveFactorialHelper(int num, long acc) {
        if(num <= 0) {
            return acc;
        }
        long newAcc = acc*num;
        return recursiveFactorialHelper(--num, newAcc);
    }

    public static void rollDie() {
        int cont = 1;
        do {
            System.out.println("Enter the number of sides per dice 1 to 1000:");
            int userInput = getInteger(1,1000);
            int random1 = (int) Math.floor(Math.random()*userInput)+1;
            int random2 = (int) Math.floor(Math.random()*userInput)+1;
            System.out.printf("Dice #1: %d;  Dice #2: %d\n\n", random1, random2);
            System.out.println("Would you like to continue? 0) No  1) Yes");
            cont = getInteger(0, 1);
        } while (cont == 1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveMultiplyStuff(9, 9));

        System.out.println("Enter a number between 1 to 10:");
        System.out.println(getInteger(1,10));

        factorialStuff();
        recursiveFactorialStuff();

        rollDie();
    }
}
