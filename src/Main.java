import java.util.Scanner;

public class Main {


    // Recursive approach
    public static long factorialRecursive (long number){
        if(number == 0) {
            return 1;
        } else {
            return (number * factorialRecursive(number - 1));
        }
    }
    // Iterative approach
    public static long factorialAscendingIteration(long number){

        int factorial = 1;

        for(int i = 1; i<=number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialDescendingIteration(long number){

        int factorial = 1;

        for(long i = number; i>=1; i--){
            factorial *=i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        System.out.println("\nWhich number do you want to calculate its factorial?");

        Scanner scanner = new Scanner(System.in);

        // Beware that the long data type holds signed 64-bit (8-byte) integers ranging in value from -9,223,372,036,854,775,808 through 9,223,372,036,854,775,807 (9.2...E+18).

        long userInput = scanner.nextLong();

        System.out.println("Factorial of " + userInput + " is: " + factorialRecursive(userInput));
    }
}