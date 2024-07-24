import java.util.*;

public class arraysAss3{
    public static void main(String[] args)
    {

        System.out.println("Enter Size of Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a=new int[size];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the Element to be Found: ");
        int num=scan.nextInt();
        boolean found=false;
        int pos=0;
        for(int i=0;i<size;i++)
        {
            if(num==a[i])
            {
                found=true;
                pos=i;
            }
        }
        if(found==true)
        {
            System.out.println("Element found at index: "+pos);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
