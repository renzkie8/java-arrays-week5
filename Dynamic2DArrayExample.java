import java.util.Arrays;
import java.util.Scanner;

public class Dynamic2DArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Array Size: ");
        int numRows = scanner.nextInt();

        System.out.print("Input an Element: ");
        int numCols = scanner.nextInt();

        int[][] numbers = new int[numRows][numCols]; // Create a 2D array to store integers

        // Input integers
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter the number at row " + (i + 1) + ", column " + (j + 1) + ": ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        // Transpose the array
        int[][] transposed = new int[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposed[j][i] = numbers[i][j];
            }
        }

        // Ask for sorting order
        System.out.print("Do you want to sort the transposed array in ascending or descending order? (asc/desc): ");
        String order = scanner.next();

        // Sort each row of the transposed array
        for (int i = 0; i < numCols; i++) {
            if (order.equalsIgnoreCase("asc")) {
                Arrays.sort(transposed[i]);
            } else if (order.equalsIgnoreCase("desc")) {
                Arrays.sort(transposed[i]);
                for (int j = 0; j < transposed[i].length / 2; j++) {
                    int temp = transposed[i][j];
                    transposed[i][j] = transposed[i][transposed[i].length - 1 - j];
                    transposed[i][transposed[i].length - 1 - j] = temp;
                }
            }
        }

        scanner.close();

        // Print the transposed and sorted array
        System.out.println("Transposed and Sorted Array:");
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
