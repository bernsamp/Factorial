import java.util.Scanner;

public class Main {


    // Recursive approach
    public static long factorial (long number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }

    public static void main(String[] args) {

        System.out.println("\nWhich number do you want to calculate its factorial?");

        Scanner scanner = new Scanner(System.in);

        // Beware that the long data type holds signed 64-bit (8-byte) integers ranging in value from -9,223,372,036,854,775,808 through 9,223,372,036,854,775,807 (9.2...E+18).

        long userInput = scanner.nextLong();

        System.out.println("Factorial of " + userInput + " is: " + factorial(userInput));
    }
}