import java.util.*;

public class arraysAss9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = withoutTen(array);

        System.out.println("Array after removing 10's and shifting elements:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] withoutTen(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                newArray[index++] = num;
            }
        }

        while (index < n) {
            newArray[index++] = 0;
        }

        return newArray;
    }
}

