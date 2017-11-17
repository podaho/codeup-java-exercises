import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
/************** Loop Basics ***************
*        byte i = 5;
*        while(i <= 15) {
*            System.out.print((i++)+" ");
*        }
*        System.out.println("");
*
*        int j = 0;
*        do {
*            System.out.println(j);
*            j += 2;
*        } while(j <= 100);
*
*        byte j = 110;
*        do {
*            j -= 10;
*            System.out.println(j);
*        } while(j >= 0);
*
*        long k = 2;
*        do {
*            System.out.println(k);
*            k *= k;
*        } while(k < 1000000);
*
*        for(byte i = 5; i <= 15; i++) {
*            System.out.print(i+" ");
*        }
*        System.out.println("");
*
*        for(byte j = 0; j <= 100; j+=2) {
*            System.out.println(j);
*        }
*
*        for(byte j = 110; j >= 0; j-=10) {
*            System.out.println(j);
*        }
*
*        for(long k = 2; k < 1000000; k*=k) {
*            System.out.println(k);
*        }
******************************************/


/**************** FizzBuzz ****************
*        for(int i = 1; i <= 100; i++) {
*            if(i % 3 == 0 || i % 5 == 0) {
*                String output = "";
*                if(i % 3 == 0) {
*                    output += "Fizz";
*                }
*                if(i % 5 == 0) {
*                    output += "Buzz";
*                }
*                System.out.println(output);
*                continue;
*            }
*            System.out.println(i);
*        }
*******************************************/


/************* Table of Powers *************
*        boolean cont = true;
*        int input;
*        while(cont) {
*            Scanner sc = new Scanner(System.in);
*            System.out.println("What number would you like to go up to?");
*            input = sc.nextInt();
*            int maxLen = Long.toString(input*input*input).length();
*            if(maxLen < "squared".length()) maxLen = "squared".length();
*            String retStr = "";
*            retStr += "number";
*            for(byte i = 0; i < maxLen-"number".length(); i++) {
*                retStr += " ";
*            }
*            retStr += " | ";
*            retStr += "squared";
*            for(byte i = 0; i < maxLen-"squared".length(); i++) {
*                retStr += " ";
*            }
*            retStr += " | ";
*            retStr += "cubed";
*            for(byte i = 0; i < maxLen-"cubed".length(); i++) {
*                retStr += " ";
*            }
*            System.out.println(retStr);
*            retStr = "";
*            for(byte j = 0; j < 3; j++) {
*                for(byte i = 0; i < maxLen; i++) {
*                    retStr += "-";
*                }
*                if(j < 2) retStr += " | ";
*            }
*            System.out.println(retStr);
*            retStr = "";
*            for(int i = 1; i <= input; i++) {
*                for(byte k = 1; k <= 3; k++) {
*                    retStr += Integer.toString((int) Math.pow((double) i, (double) k));
*                    for(byte j = 0; j < maxLen-Integer.toString((int) Math.pow((double) i, (double) k)).length(); j++) {
*                        retStr += " ";
*                    }
*                    if(k < 3) retStr += " | ";
*                }
*                System.out.println(retStr);
*                retStr = "";
*            }
*            System.out.println("Would you like to continue? 1) Yes  2) No");
*            int resp = sc.nextInt();
*            if(resp != 1) cont = false;
*        }
********************************************/

        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        byte grade;
        byte resp;
        do{
            System.out.println("Enter your number grade");
            grade = sc.nextByte();
            while(true) {
                if(grade <= 59) {
                    System.out.println('F');
                    break;
                }
                if(grade <= 66) {
                    System.out.println('D');
                    break;
                }
                if(grade <= 79) {
                    System.out.println('C');
                    break;
                }
                if(grade <= 87) {
                    System.out.println('B');
                    break;
                }
                System.out.println('A');
                break;
            }
            System.out.println("Continue? 1) Yes  2) No");
            resp = sc.nextByte();
            if(resp != 1) cont = false;
        } while(cont);
    }
}
