import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        String message;
//        message = "We don't need no education\nWe don't need no thought control";
//        System.out.println(message + "\n");
//        message = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(message + "\n");
//        message = "In windows, the main drive is usually C:\\";
//        System.out.println(message + "\n");
//        message = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//        System.out.println(message + "\n");
//
//        System.out.println(dateFormatConverter("4/19/1993"));
//
//        countVowels("The hill are alive.");
//        doCalc("1 + 1 + 3 * 5 / 4 + 6 - 1 * 3", 2);
    }

/*      ================================= STRING BONUSES
        ----BONUS 1
        Create date format converter application.
                Take in the following format:
        MM/DD/YYYY
        Output the following:
        MonthName DD, YYYY
        Example:
        input - 12/01/1999
        output - December 12, 1999                              */

    public static String dateFormatConverter(String input) {
        int firstDivide = input.indexOf('/');
        int lastDivide = input.lastIndexOf('/');

        String month = input.substring(0, firstDivide);
        String day = input.substring(firstDivide+1, lastDivide);
        String year = input.substring(lastDivide+1);

        int monthNum = Integer.parseInt(month);

        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "Novermber";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Month-Not-In-Range";
                break;
        }

        return month+" "+day+", "+year;
    }


/*      ----BONUS 2
        Create an application that allows the user to enter a sentence
        and tells them how many vowels and consonants were used.
        Example:
        input - "The hill are alive."
        output - 5 vowels and 10 consonants                     */

    public static void countVowels(String str) {
        int countVow = 0;
        int countCon = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                System.out.println(c+" is a vowel");
                countVow += 1;
            } else if(Character.toString(c).toLowerCase().charAt(0) != Character.toString(c).toUpperCase().charAt(0)) {
//                System.out.println("Counted "+c+" since "+Character.toString(c).toLowerCase()+" != "+Character.toString(c).toUpperCase());
                countCon += 1;
            }
        }
        System.out.printf("There are %d vowels and %d consonants\n", countVow, countCon);
    }


/*      ----BONUS 3
        Create a command line calculator application.
        The program should welcome the user, prompt them for a calculation,
        and give the result. The user should be prompted after each result is
        outputted if they want to enter another calculation. When they
        say no, give them an exit message. Allow the user first to specify
        how many operands they will enter. Do not worry about
        input validation (assume user enters correct data type).
        Example program:
...
        WELCOME TO THE CALCULATOR APP!!! (program output)
        Do you wish to enter a new calculation? (program output)
        yes (user inputs this)
        How many operands will you calculate? (program output)
        2 (user inputs this)
        Please enter a calculation: (program output)
        2 + 2 (user enters this or something like this)
        The output of 2 + 2 is 4. (program outputs this)
        Do you wish to enter a new calculation? (program outputs this)
        no (user enters this)
        GOODBYE!!!
*/

//    public static String doCalc(String str, int idx) {
//        String strToReplace = "";
//        String leftOp = str.substring(0, idx).trim();
//        int opCutoffLeft = -1;
//        if(leftOp.lastIndexOf('*') != -1) {
//            opCutoffLeft = leftOp.lastIndexOf('*');
//        }
//        if(leftOp.lastIndexOf('/') != -1 && leftOp.lastIndexOf('/') > opCutoffLeft) {
//            opCutoffLeft = leftOp.lastIndexOf('/');
//        }
//        if(leftOp.lastIndexOf('+') != -1 && leftOp.lastIndexOf('+') > opCutoffLeft) {
//            opCutoffLeft = leftOp.lastIndexOf('+');
//        }
//        if(leftOp.lastIndexOf('-') != -1 && leftOp.lastIndexOf('-') > opCutoffLeft) {
//            opCutoffLeft = leftOp.lastIndexOf('-');
//        }
//        if(opCutoffLeft == -1) {
//            leftOp = leftOp.trim();
//        } else {
//            leftOp = leftOp.substring(opCutoffLeft+1).trim();
//        }
//        int leftOpNum = Integer.parseInt(leftOp);
//        System.out.println("leftOpNum: "+leftOpNum);
//
//        String rightOp = str.substring(idx+1).trim();
//        int opCutoffRight = -1;
//        if(rightOp.indexOf('*') != -1) {
//            opCutoffRight = rightOp.indexOf('*');
//        }
//        if(rightOp.indexOf('/') != -1 && rightOp.indexOf('/') < opCutoffRight) {
//            opCutoffRight = rightOp.indexOf('/');
//        }
//        if(rightOp.indexOf('+') != -1 && rightOp.indexOf('+') < opCutoffRight) {
//            opCutoffRight = rightOp.indexOf('+');
//        }
//        if(rightOp.indexOf('-') != -1 && rightOp.indexOf('-') < opCutoffRight) {
//            opCutoffRight = rightOp.indexOf('-');
//        }
//        if(opCutoffRight == -1) {
//            rightOp = rightOp.trim();
//        } else {
//            rightOp = rightOp.substring(0, opCutoffRight).trim();
//        }
//        int rightOpNum = Integer.parseInt(rightOp);
//        System.out.println("rightOpNum: "+rightOpNum);
//
//        double result;
//        switch(str.charAt(idx)) {
//            case '+':
//                System.out.println((double) (leftOpNum + rightOpNum));
//                result = (double) (leftOpNum + rightOpNum);
//            case '-':
//                System.out.println((double) (leftOpNum - rightOpNum));
//                result = (double) (leftOpNum - rightOpNum);
//            case '*':
//                System.out.println((double) (leftOpNum * rightOpNum));
//                result = (double) (leftOpNum * rightOpNum);
//            case '/':
//                System.out.println((double) ((float) leftOpNum) / rightOpNum);
//                result = (double) ((float) leftOpNum) / rightOpNum;
//            default:
//                result = 0.0;
//        }
//
//        if(opCutoffLeft == -1 && opCutoffRight == -1) {
//            return result + "";
//        } else if(opCutoffLeft == -1) {
//            return result + " " + str.substring(opCutoffRight);
//        } else if(opCutoffRight == -1) {
//            return str.substring(0, opCutoffLeft+1) + " " + result;
//        } else {
//
//        }
//    }

//    public static void calculatorApp() {
//        System.out.println("Welcome to The Calculator App!");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Do you wish to enter a new calculation? 1) Yes  2) No");
//        int resp = sc.nextInt();
//        System.out.println("How many operands will you calculate? Enter Number:");
//        int numOp = sc.nextInt();
//        System.out.println("Please enter a calculation seperating operand and operation with spaces:");
//        String calc = sc.nextLine();
//        for(int i = 0; i < calc.length(); i++) {
//            char c = calc.charAt(i);
//            if(c == '*' || c == '/') {
//
//            }
//        }
//    }
}
