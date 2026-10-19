import java.util.Scanner;

public class NaturalNumbers4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Input NumStart: ");
        int numStart = number.nextInt();

        System.out.print("Input NumEnd: ");
        int numEnd = number.nextInt();

        number.close();

        int sum = 0; // Initialize the sum variable

        switch (numStart) {
            case 4:
                for (int i = numStart; i <= numEnd; i++) {
                    sum += i; // Add each number to the sum
                    // System.out.println("it will add "+ i ); // Print the sum for each iteration
                }
                System.out.println("Output: The Sum is " + sum);
                break;
            default:
                System.out.println("Please start from 4.");
        }
    }
}
