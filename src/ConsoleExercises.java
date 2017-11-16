import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");

//        System.out.println("Enter an Integer:");
//        int myInt = sc.nextInt();
//
//        System.out.println("Enter 3 words:");
//        // Entering more than one word will only register the total number of words equivalent to the number of sc.next()
//        // Entering less will cause the console to wait for the next input
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println("word1 = "+word1+", word2 = "+word2+", word3 = "+word3);
//
//        System.out.println("Enter a sentence:");
//        sc.nextLine();
//        String mySentence = sc.nextLine();
//        System.out.println(mySentence);

        System.out.println("We are about to calculate the perimeter of Codeup's classroom");
        System.out.println("Enter the length of the classroom:");
        String len = sc.nextLine();
        System.out.println("Enter the width of the classroom:");
        String wdt = sc.nextLine();
        System.out.println("Enter the height of the classroom:");
        String hgt = sc.nextLine();
        float length = Float.parseFloat(len);
        float width = Float.parseFloat(wdt);
        float height = Float.parseFloat(hgt);
        System.out.println("Area of the classroom is: "+length+"x"+width+"="+length*width);
        System.out.println("Perimeter of the classroom is: ("+length+"+"+width+")x2="+(length+width)*2);
        System.out.println("Volume of the classroom is: ("+length+"x"+width+"x"+height+"="+length*width*height);
    }
}