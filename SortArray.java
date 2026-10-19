import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);

        System.out.println("Example 1: ");
        System.out.print("Input Array Size: ");
        int s = array.nextInt();

        Integer[] elemIntegers = new Integer[s];

        // Use to read and store integers into the array.
        for (int i = 0; i < s; i++) {
            System.out.print("Input an Element: ");
            elemIntegers[i] = array.nextInt();
        }

        array.nextLine(); // Consume the null character of the supposed newline ( to make string dissapear after asking a integer.)

        // Ask for what type of sorting order: des or asc =  error
        
        String order = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Order (type DES for Descending or ASC for Ascending): ");
            order = array.nextLine();
            if (order.equals("ASC")) {
                validInput = true;
            } else if (order.equals("DES")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please type 'ASC' or 'DES'.");
            }
        }
        
       // Sort the array based on user input
       if (order.equalsIgnoreCase("ASC")) {// the sorting logical method for if the inputted is to ascend the order of the elements inside the array size of [n]
        // sort logic for ascending order
        for (int i = 0; i < elemIntegers.length - 1; i++) {
            for (int j = 0; j < elemIntegers.length - 1 - i; j++) {//-- get the size length of the array elements inputted in array size//
                if (elemIntegers[j] > elemIntegers[j + 1]) {
                    int temp = elemIntegers[j];
                    elemIntegers[j] = elemIntegers[j + 1];
                    elemIntegers[j + 1] = temp;
                }
            }
        }
    } else if (order.equalsIgnoreCase("DES")) {// the sorting logic for else if the input is to descend the order of the elements
        // sorting logic for descending order
        for (int i = 0; i < elemIntegers.length - 1; i++) {
            for (int j = 0; j < elemIntegers.length - 1 - i; j++) {//-- get the size length of the array elements inputted in array size//
                if (elemIntegers[j] < elemIntegers[j + 1]) {
                    int temp = elemIntegers[j];
                    elemIntegers[j] = elemIntegers[j + 1];
                    elemIntegers[j + 1] = temp;
                }
            }
        }
    } else {
        System.out.println("Invalid input. Please type 'ASC' or 'DES'.");
    }
        array.close();// close the scanner

        // Print the output
        System.out.println("Output:");
        for (int i = 0; i < elemIntegers.length; i++) {// int i > 5(input size of array); until it reaches the size of 5 it will increment by 1 : elemIntegers in DES(ex. 5, 4, 3, 2, 1 )
            if (i > 0) {
                System.out.print(", ");
            }
        System.out.print(elemIntegers[i]); } 
           // print the order of the descending or ascending value of the inputted elements 
           System.out.println();
        }
    }

