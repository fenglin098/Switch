import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numDays;
        String monthName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of days:");
        numDays = keyboard.nextInt();
        if (numDays < 28) {
            System.out.println("No months have exactly " + numDays + " days");
        } else {
            switch (numDays) {
                case 31:
                    monthName = "January, March, May, July, August, October and December";
                    break;
                case 30:
                    monthName = "April, June, September and November";
                    break;
                case 28:
                    monthName = "February";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + numDays);
            }
            System.out.println(monthName);
        }
    }
}