import java.util.*;

public class arraysAss8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                flag = 1;
            } else if (array[i] == 7) {
                flag = 0;
                i++;
            }
            if (flag != 1) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}
