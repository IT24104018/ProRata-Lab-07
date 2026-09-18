import java.util.Scanner;

public class IT24104018Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter mark for Subject 1: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter mark for Subject 2: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter mark for Subject 3: ");
        double mark3 = input.nextDouble();

        System.out.print("Enter mark for Subject 4: ");
        double mark4 = input.nextDouble();

        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("Average = " + average);

        // Find grade
        if (average >= 75 && average <= 100) {
            System.out.println("Grade = Distinction");
        }
        else if (average >= 50 && average < 75) {
            System.out.println("Grade = Credit");
        }
        else if (average >= 0 && average < 50) {
            System.out.println("Grade = Fail");
        }
        else {
            System.out.println("Invalid marks");
        }

        input.close();
    }
}