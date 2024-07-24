import java.util.*;

public class arraysAss5{
    public static void main(String[] args)
    {
        System.out.println("Enter array size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Min 1 = "+a[0]+" Min 2 = "+a[1]+" Max 1 = "+a[size-1]+" Max 2 = "+a[size-2]);
    }
}
