import java.util.Arrays;

public class ArrayExercises {
    public static int getRandomIntBetween(int min, int max) {
        return (int)Math.floor(min+(Math.random()*(max-min+1)));
    }

    public static int countOdds(int[] arr) {
        int ret = 0;
        for(int i : arr) {
            if(i%2==1) {
                ret++;
            }
        }
        return ret;
    }

    public static double average(int[] arr) {
        double sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum/arr.length;
    }

    public static String[] fizzBuzzify(int[] arr) {
        String[] ret = new String[100];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                ret[i] = "FizzBuzz";
            } else if(arr[i] % 3 == 0) {
                ret[i] = "Fizz";
            } else if(arr[i] % 5 == 0) {
                ret[i] = "Buzz";
            } else {
                ret[i] = Integer.toString(arr[i]);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] intArr = new int[100];
        for(int i = 0; i < 100; i++) {
            intArr[i] = getRandomIntBetween(1,100);
        }
        System.out.println("There are "+countOdds(intArr)+" odd numbers among the 100 randoms.");
        System.out.println("The average of the 100 randoms is "+average(intArr));
//        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(fizzBuzzify(intArr)));
    }
}
