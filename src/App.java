import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        // Initialize variable to store number of days in the month
        int daysInMonth = 0;
        
        // Switch case to determine the number of days based on the month
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2:  // February
                // Check if the year is a leap year for February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            default:
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
                return; // Exit program if month is invalid
        }
        
        // Display the result
        System.out.println("Month " + month + " of year " + year + " has " + daysInMonth + " days.");
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}