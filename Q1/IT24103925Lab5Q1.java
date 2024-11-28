import java.util.Scanner;

public class IT24103925Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Displaying the numbers entered by the user
        System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

        // Finding the smallest number
        int smallest = num1;  
        if (num2 < smallest) {
            smallest = num2; 
        }
        if (num3 < smallest) {
            smallest = num3; 
        }

        // Finding the largest number
        int largest = num1;  // Assume num1 is the largest
        if (num2 > largest) {
            largest = num2; // num2 is larger
        }
        if (num3 > largest) {
            largest = num3; // num3 is larger
        }

        // Displaying the smallest and largest numbers
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}
