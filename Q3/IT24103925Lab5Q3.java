import java.util.Scanner;

public class IT24103925Lab5Q3 {
    
    public static final double CHARGE = 48000.00;
    public static final int DISCOUNT_3_4 = 10; // 
    public static final int DISCOUNT_5_MORE = 20; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = end - start;
        double total;

        if (days < 3) {
            total = days * CHARGE;
        } else if (days <= 4) {
            total = days * CHARGE * (1 - DISCOUNT_3_4 / 100.0);
        } else {
            total = days * CHARGE * (1 - DISCOUNT_5_MORE / 100.0);
        }

        System.out.println("Room Charge Per Day: Rs. " + CHARGE);
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: Rs. " + total);
    }
}
