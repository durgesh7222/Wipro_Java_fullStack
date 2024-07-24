import java.util.*;

public class arraysAss2{
    public static void main(String[] args)
    {
        int size;
        System.out.print("Enter Size: ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Values: ");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int min=a[0];
        int max=a[size-1];
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

    }
}
