import java.util.Scanner;

public class StudentsArray{
  public static void main(String[]args){

    Scanner array = new Scanner(System.in);
    System.out.println("Enter the number of student:");
    int numStudent = array.nextInt();

    array.nextLine();

    String[]studentNames = new String [numStudent];

    for(int i = 0; i<numStudent; i++){
      System.out.println("Enter the Name of Student " + ( i + 1) + " : ");
      studentNames[i] = array.nextLine();

    }

    array.close();
    System.out.println("Student Names:");
    for(int i = 0; i<studentNames.length; i++){
      System.out.println(studentNames[i]);
    }
  }
}