import java.util.*;

public class arraysAss14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
        } else {
            int[][] array = new int[3][3];
            int x = 0;

            // Storing elements
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Integer.parseInt(args[x++]);
                }
            }

            System.out.println("The given array is:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max)
                        max = array[i][j];
                }
            }
            System.out.println("The biggest number in the given array is " + max);
        }
    }
}
