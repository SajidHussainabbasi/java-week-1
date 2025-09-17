/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
         int x = 10;
        int y = 3;

        // Perform arithmetic operations
        System.out.println("x + y = " + (x + y));   // Addition
        System.out.println("x - y = " + (x - y));   // Subtraction
        System.out.println("x * y = " + (x * y));   // Multiplication
        System.out.println("x / y = " + (x / y));   // Division (integer result)
        System.out.println("x % y = " + (x % y));   // Modulus (remainder)

        // If you also want floating-point division
        System.out.println("x / (double)y = " + ((double)x / y)); 

        // Exponentiation (Java doesn’t have an operator, so we use Math.pow)
        System.out.println("x ^ y = " + Math.pow(x, y));

        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
         System.out.println("Integer division (7 / 2) = " + (7 / 2));

        // Floating-point division
        System.out.println("Floating-point division (7.0 / 2) = " + (7.0 / 2));

        // Remainder
        System.out.println("Remainder (7 % 2) = " + (7 % 2));

        // 3. Use double variables for division and compare with int division.
        int numInt1 = 7;
        int numInt2 = 2;

        // Double variables
        double numDouble1 = 7.0;
        double numDouble2 = 2.0;

        // Integer division
        int intResult = numInt1 / numInt2;
        System.out.println("Integer division (7 / 2) = " + intResult);

        // Double division
        double doubleResult = numDouble1 / numDouble2;
        System.out.println("Double division (7.0 / 2.0) = " + doubleResult);

        // Mixed division (int + double)
        double mixedResult = numInt1 / numDouble2;
        System.out.println("Mixed division (7 / 2.0) = " + mixedResult);
        // 4. Create three int variables, add them, and print the total.
           int first = 10;
        int second = 20;
        int third = 30;

        // Add them
        int total = first + second + third;

        // Print the total
        System.out.println("The total is: " + total);
        // 5. Calculate the square of a number (e.g., 6 * 6).
        // Number to square
        int number = 6;

        // Method 1: Multiplication
        int square1 = number * number;
        System.out.println("Square of " + number + " (using multiplication) = " + square1);

        // Method 2: Using Math.pow()
        int square2 = (int) Math.pow(number, 2);
        System.out.println("Square of " + number + " (using Math.pow) = " + square2);
        

        // 6. Calculate the average of three numbers.
             int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Calculate sum
        int sum1 = num1 + num2 + num3;

        // Calculate average
        double average = sum1 / 3.0; // Use 3.0 to get a double result

        // Print the average
        System.out.println("The average of the three numbers is: " + average);

        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        try {
            int Result = 10 / 0;
            System.out.println("Integer division result: " + Result);
        } catch (ArithmeticException e) {
            System.out.println("Integer division by zero causes an exception: " + e);
        }

        // Double division by zero
        double doubleResult1 = 10.0 / 0;
        double doubleResult2 = -10.0 / 0;
        double doubleResult3 = 0.0 / 0;

        System.out.println("Double division 10.0 / 0 = " + doubleResult1);  // Infinity
        System.out.println("Double division -10.0 / 0 = " + doubleResult2); // -Infinity
        System.out.println("Double division 0.0 / 0 = " + doubleResult3);   // NaN
    }
}
