import java.util.*;

public class flowControlStatementAss17{
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        int originalNumber = number;
        int reversed = 0;


        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}


