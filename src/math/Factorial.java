package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Factorial rc = new Factorial();

        System.out.println("Factorial:" + rc.getFactorial(5));
    }

    public int getFactorial(int number) {
        int result = 0;
        if (number == 1) {
            return 1;
        } else {
            result = number * getFactorial(number - 1);
            System.out.print("Returned" + result);
            return result;
        }
    }
}