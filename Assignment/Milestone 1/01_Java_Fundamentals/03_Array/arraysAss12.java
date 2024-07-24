import java.util.*;

public class arraysAss12{
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for the first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter 3 elements for the second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = middleWay(a, b);

        System.out.println("New array with middle elements: [" + result[0] + ", " + result[1] + "]");

        scanner.close();
    }
}
