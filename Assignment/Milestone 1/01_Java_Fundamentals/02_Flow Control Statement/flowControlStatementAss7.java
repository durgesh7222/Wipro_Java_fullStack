import java.util.*;

public class flowControlStatementAss7{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char a=scan.next().charAt(0);
        
        if(Character.isUpperCase(a))
        {
            System.out.println(Character.toLowerCase(a));
        }
        else{
            System.out.println(Character.toUpperCase(a));
        }
    }
}





