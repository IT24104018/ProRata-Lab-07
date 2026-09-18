import java.util.Scanner;

public class IT24104018Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("\nCustomer " + customer);

            System.out.print("Enter total bill amount: ");
            double totalBill = input.nextDouble();

            System.out.print("Enter payment mode (C/c for Cash, O/o for Other): ");
            char paymentMode = input.next().charAt(0);

            double discount;
            double amountToPay;

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = totalBill * 0.05;
                amountToPay = totalBill - discount;

                System.out.println("Discount = Rs. " + discount);
                System.out.println("Amount to be paid = Rs. " + amountToPay);

            }
            else if (paymentMode == 'O' || paymentMode == 'o') {

                discount = 0;
                amountToPay = totalBill;

                System.out.println("Discount = Rs. " + discount);
                System.out.println("Amount to be paid = Rs. " + amountToPay);

            }
            else {

                System.out.println("Payment Mode is Not Valid");

            }
        }

        input.close();
    }
}