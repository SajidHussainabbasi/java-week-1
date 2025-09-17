/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two int variables x = 15, y = 25.
 *    - Use a ternary operator to find and print the minimum value.
 *
 * 2. Create an int variable age = 18.
 *    - Use a ternary operator to print "Adult" if age >= 18, otherwise "Minor".
 *
 * 3. Create three int variables a = 10, b = 20, c = 15.
 *    - Use nested ternary operators to find the largest of the three numbers.
 *
 * 4. Create a boolean variable isRaining = true.
 *    - Use a ternary operator to print "Take an umbrella" if true, else "No umbrella needed".
 *
 * Bonus:
 * 5. Use a ternary operator to check if a number n = 7 is even or odd and print the result.
 * -------------------------------------------------------------
 */

public class TernaryE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        // Example: maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);


        // -------------------- Student Exercises --------------------

        // 1. Find minimum of x = 15, y = 25
        int x = 15;
        int y = 25;
        int min = (x < y) ? x : y;
        System.out.println("1. Minimum of x and y: " + min);

        // 2. Check age
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("2. Age " + age + ": " + status);

        // 3. Largest of three numbers using nested ternary
        int num1 = 10, num2 = 20, num3 = 15;
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) 
                                     : ((num2 > num3) ? num2 : num3);
        System.out.println("3. Largest of num1, num2, num3: " + largest);

        // 4. Umbrella advice
        boolean isRaining = true;
        String advice = isRaining ? "Take an umbrella" : "No umbrella needed";
        System.out.println("4. Weather advice: " + advice);

        // 5. Check if n = 7 is even or odd
        int n = 7;
        String evenOdd = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("5. Number " + n + " is " + evenOdd);
    }
}