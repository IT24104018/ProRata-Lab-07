import java.util.Scanner;

public class IT24104018Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);

            System.out.print("Enter 4 subject marks separated by spaces: ");

            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();

            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            // Display average
            System.out.println("Average = " + average);

            // Find and display grade
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
                System.out.println("Invalid Marks");
            }

            System.out.println();
        }

        input.close();
    }
}