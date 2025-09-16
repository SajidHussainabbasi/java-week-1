/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
         System.out.println("Exercise 1:");
        for(int i=10;i>0;i--){
            System.out.println("For Loop ,Print numbers from 10 to 1 (reverse order)"+i);
        }

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
         System.out.println("Exercise 2:");
        int number = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
         System.out.println("Exercise 3:");
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i; // add i to sum
            i++;      // move to next number
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        System.out.println("Exercise 4:");
        int odd = 1;

        while (odd <= 20) {
            if (odd % 2 != 0) {
                System.out.println(odd);
            }
            odd++;
        }

        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        System.out.println("Exercise 5:");
        int[] Inputs = {8, 12, 5, 0, -3}; 
        int index = 0;
        int number1;

        do {
            number1 = Inputs[index];  // simulate user entering a number
            System.out.println("You entered: " + number1);
            index++;
        } while (number1 >= 0 && index < Inputs.length);

        System.out.println("Do while Loop ended because a negative number was entered.");
        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
         System.out.println("Exercise 6:");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (String color : colors) {
            System.out.println(color.toUpperCase());
        }
        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
         System.out.println("Exercise 7:");
        int[] numbers = {2, 4, 6, 8, 10};
        int sum1 = 0;

        for (int num : numbers) {
            sum1 += num;
        }

        System.out.println("The sum of the array is: " + sum1);
        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
         System.out.println("Exercise 8:");
        for (int r = 1; r <= 3; r++) {       // outer loop for rows
            for (int j = 1; j <= 3; j++) {   // inner loop for columns
                System.out.print(r * j + "\t"); // \t adds a tab space
            }
            System.out.println(); 
        }
        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
         System.out.println("Exercise 9:");
         int rows = 4; // number of rows in the pattern

        for (int row = 1; row <= rows; row++) {       // outer loop for each row
            for (int j = 1; j <= row; j++) {         // inner loop for stars in a row
                System.out.print("*");
            }
            System.out.println();                     // move to next row
        }
        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.
        
         System.out.println("Exercise 10:");
        for (int num = 1; num <= 20; num++) {
            if (num % 3 == 0) {
                continue; // skip multiples of 3
            }

            if (num > 15) {
                break; // stop the loop if number is greater than 15
            }

            System.out.println(num);
        }
        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        System.out.println("Exercise 11:"); 
        int value = 1;

        while (value <= 10) {
            if (value % 7 == 0) {
                break; // stop when number is divisible by 7
            }

            System.out.println(value);
            value++;
        }
    }
}