import java.util.*;
public class flowControlStatementAss1a{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        boolean result = (num1 % 10) == (num2 % 10);
        System.out.println(result);
    }
}

