import java.util.*;

public class arraysAss7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        int[] temp = new int[n];
        int uniqueCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[uniqueCount++] = numbers[i];
            }
        }
        temp[uniqueCount++] = numbers[n - 1];

        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

