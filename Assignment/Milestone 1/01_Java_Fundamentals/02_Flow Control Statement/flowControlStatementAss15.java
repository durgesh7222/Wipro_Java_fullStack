import java.util.*;

public class flowControlStatementAss15{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}






