public class HelloWorld {
    public static void main(String[] args) {
        //        System.out.println("Hello, World");
        System.out.print("Hello,");
        System.out.print(" World!\n");


        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);


        String myString = "This is a stringy string";
        //        String myString = 'T'; //Cannot Assign Char type to String
        //        String myString = 3.14159; //Cannot Assign double type to String
        System.out.println(myString);


        //        long myNumber = 3.14; //Cannot assign double value to long
        //        long myNumber = 123;
        //        long myNumber = 123L;
        float myNumber = 3.14F;
        //        float myNumber = (float) 3.14;
        System.out.println(myNumber); //Cannot print unassigned values


        int x = 5;
        System.out.println(x++); //postfix: uses value, then increments
        System.out.println(x);


        int y = 5;
        System.out.println(++y); //prefix: increments
        System.out.println(y);


        //        int class; //cannot create variable names with reserved words
        int i = 4;
        i += 5; //i = i + 5;
        System.out.println(i);


        int j = 3;
        int k = 4;
        j *= k; //j = j * k;
        System.out.println(j);


        int l = 10;
        int m = 2;
        l /= m; //l = l / m
        l -= m; //l = l - m
        System.out.println(l);
    }
}
