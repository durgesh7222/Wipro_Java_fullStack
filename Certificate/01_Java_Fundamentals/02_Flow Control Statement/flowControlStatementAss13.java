import java.util.*;

public class flowControlStatementAss13{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");

        for (int number = 10; number <= 99; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Eliminate even numbers greater than 2
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}






