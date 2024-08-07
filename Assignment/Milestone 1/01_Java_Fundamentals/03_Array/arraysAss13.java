import java.util.*;

public class arraysAss13 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
        } else {
            int[][] array = new int[2][2];
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

            System.out.println("The reverse of the array is:");
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
