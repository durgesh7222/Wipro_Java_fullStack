import java.util.*;

public class flowControlStatementAss8{
     public static void main(String args[])
    {
        System.out.println("Enter a Colour Code from the Following R G B O Y W: ");
        Scanner scan = new Scanner(System.in);
        char choice = scan.next().charAt(0);
        switch(choice)
        {
            case 'R': 
            System.out.println("Red");
            break;
            case 'G':
            System.out.println("Green");
            break;
            case 'B':
            System.out.println("Blue");
            break;
            case 'O':
            System.out.println("Orange");
            break;
            case 'Y':
            System.out.println("Yellow");
            break;
            case 'W':
            System.out.println("White");
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}





