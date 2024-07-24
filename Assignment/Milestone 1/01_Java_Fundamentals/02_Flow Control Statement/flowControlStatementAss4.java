import java.util.*;
public class flowControlStatementAss4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first character:");
        char char1 = scanner.next().charAt(0);

        System.out.println("Enter the second character:");
        char char2 = scanner.next().charAt(0);

        if (char1 > char2) {
            System.out.println(char2 + "," + char1);
        } else {
            System.out.println(char1 + "," + char2);
        }
    }
}





