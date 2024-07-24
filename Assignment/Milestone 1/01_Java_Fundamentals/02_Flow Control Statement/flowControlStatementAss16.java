import java.util.*;

public class flowControlStatementAss16{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int reverse=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num= num/10;
        }
        System.out.println("Reversed Number is: " + reverse);
    }
}






