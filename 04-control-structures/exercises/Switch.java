/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable month (1-12).
 *    - Use a switch statement to print the corresponding month name.
 *
 * 2. Create a char variable grade ('A', 'B', 'C', 'D', 'F').
 *    - Use a switch statement to print the description:
 *      'A' -> "Excellent"
 *      'B' -> "Good"
 *      'C' -> "Average"
 *      'D' -> "Below Average"
 *      'F' -> "Fail"
 *      default -> "Invalid grade"
 *
 * 3. Create an int variable trafficLight (1, 2, 3).
 *    - Use a switch to print:
 *      1 -> "Red"
 *      2 -> "Yellow"
 *      3 -> "Green"
 *      default -> "Invalid light"
 *
 * 4. Create an int variable menuOption (1-5).
 *    - Use switch to print which action was chosen (e.g., "Option 1 selected").
 *
 * Bonus:
 * 5. Combine multiple cases to handle weekends:
 *    - day = 6 or 7 -> print "Weekend"
 *    - day = 1-5 -> print "Weekday"
 * -------------------------------------------------------------
 */

public class Switch
{
    public static void main(String[] args)
    {
        int day = 3;
        String dayName;

        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        // -------------------- Student Exercises --------------------
        // 1. Create int month (1-12) and print month name using switch.
        int month = 9; 

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number. Please enter 1–12.");
        }

        // 2. Create char grade and print description using switch.
        char grade = 'B'; // change this value (A, B, C, D, F)

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // 3. Create int trafficLight (1-3) and print light color using switch.
        int trafficLight = 2; // change this value (1–3)

        switch (trafficLight) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid traffic light value. Use 1-3.");
        }

        // 4. Create int menuOption (1-5) and print which option is selected.
         int menuOption = 6; // change this value (1–5)

        switch (menuOption) {
            case 1:
                System.out.println("Option 1: View Profile");
                break;
            case 2:
                System.out.println("Option 2: Edit Profile");
                break;
            case 3:
                System.out.println("Option 3: Settings");
                break;
            case 4:
                System.out.println("Option 4: Help");
                break;
            case 5:
                System.out.println("Option 5: Logout");
                break;
            default:
                System.out.println("Invalid option. Please select 1-5.");
        }

        // 5. Combine cases for weekends (6 and 7) vs weekdays (1-5).
        int weekday = 6; // change this value (1–7)

        switch (weekday) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day. Please enter 1-7.");
        }
    }
}
