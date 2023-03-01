/**
 *
 * @Author Clay Cordary
 * @Version 1.0
 *
 */

import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;

    /**
     * @method takes two numbers and assigns them as objects.
     * @param n the number being divided being converted to an object.
     * @param m the number n is being divided with being converted to an object.
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     *
     * @return true if the remainder of n and m is zero, false otherwise.
     *
     */
    public boolean isDivisible() {
        return n % m == 0;
    }


    public static void main(String[] args) {
        /**
         * Establishes a new Scanner instance.
         * uses println to ask for input
         * uses scanner to receive input and stores it as a variable
         * repeat for second var.
          */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me your first number");
    int userInput1 = scanner.nextInt();
    System.out.println("What do you want to know if it's divisible by?");
    int userInput2 = scanner.nextInt();
    scanner.close();
        /**
         * Creates a Lab006 Object, uses isDivisible to assign a true or false value to compOutput
         * Returns true and prints userInput1 is divisible by userInput 2 if the remainde
         */
    Lab006 labOBJ = new Lab006(userInput1, userInput2);
    boolean compOutput = labOBJ.isDivisible();
    if (compOutput == true) {
        System.out.println(userInput1 + " is divisible by " + userInput2);
        } else {
        System.out.println(userInput1 + " is not divisible by " + userInput2);

    }
    }
}

