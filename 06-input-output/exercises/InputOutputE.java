/**
 * Exercises: Input and Output in Java
 * -----------------------------------------------------
 * This program demonstrates:
 * 1. Output
 *   - System.out.print(): Prints text without a newline.
 *   - System.out.println(): Prints text with a newline.
 *   - System.out.printf(): Prints formatted text.
 *
 * 2. Input (using Scanner)
 *   - nextLine(): Reads a line of text.
 *   - nextInt(): Reads an integer.
 *   - nextDouble(): Reads a double.
 *   - next(): Reads a single word.
 *
 * -----------------------------------------------------
 * 🚀 Student Exercises:
 * 1. Ask the user for their first name and last name separately,
 *    then print: "Hello, FirstName LastName!"
 *
 * 2. Ask the user to enter two integers and print their sum, difference,
 *    product, and quotient using System.out.printf for formatting.
 *
 * 3. Ask the user for the radius of a circle (double) and calculate
 *    the area (πr²) and circumference (2πr).
 *
 * 4. Ask the user to enter their age, then print whether they are
 *    a child (<13), teenager (13–19), or adult (20+).
 *
 * 5. Create a simple "login" simulation:
 *    - Ask the user for a username and password.
 *    - If username = "admin" and password = "1234",
 *      print "Access granted".
 *    - Otherwise, print "Access denied".
 *
 * -----------------------------------------------------
 */

import java.util.Scanner;

public class InputOutputE
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // ---------------- Output Examples ----------------
        System.out.print("This is printed without a newline. ");
        System.out.println("This is printed with a newline.");
        System.out.printf("Formatted number: %.2f%n", 123.456);

        // ---------------- Input Examples ----------------
        // 1. Ask for first name and last name
        System.out.print("\nEnter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Hello, " + firstName + " " + lastName + "!");

        // 2. Ask for two integers and print sum, difference, product, quotient
        System.out.print("\nEnter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        System.out.printf("Sum: %d, Difference: %d, Product: %d, Quotient: %.2f%n",
                          int1 + int2, int1 - int2, int1 * int2, (int2 != 0 ? (double)int1 / int2 : 0));

        // 3. Circle area and circumference
        System.out.print("\nEnter the radius of a circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Area: %.2f, Circumference: %.2f%n", area, circumference);

        // 4. Determine age category
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        // 5. Simple login simulation
        System.out.print("\nEnter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        scanner.close();
    }
}