import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        // Check if the input is in the valid range (1-12)
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close();
    }
}
