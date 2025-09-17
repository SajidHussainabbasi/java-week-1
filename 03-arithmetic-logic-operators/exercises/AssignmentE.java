/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create a new int variable b with the value 20.
 *    - Use += to add 10 to b and print the result.
 *    - Use -= to subtract 5 from b and print the result.
 *
 * 2. Create another int variable c with the value 15.
 *    - Multiply c by 3 using *= and print the result.
 *    - Divide c by 2 using /= and print the result.
 *
 * 3. Use %= with c to find the remainder when divided by 4.
 *
 * 4. Create a double variable d = 12.5.
 *    - Use += and *= to update d and print results.
 *
 * Bonus:
 * 5. Create a variable x = 7.
 *    - Use x += x to double its value.
 *    - Use x *= x to square its value.
 *
 * 6. Combine assignment operators in a sequence:
 *    Example: Start with y = 50, then apply -= 10, *= 2, /= 5, and %= 6.
 *    Print the value after each step.
 * -------------------------------------------------------------
 */

public class AssignmentE
{
    public static void main(String[] args)
    {
        int a = 10; // Assignment
        System.out.println("Initial value of a: " + a);

        a += 5; // Addition assignment
        System.out.println("After a += 5: " + a);

        a -= 3; // Subtraction assignment
        System.out.println("After a -= 3: " + a);

        a *= 2; // Multiplication assignment
        System.out.println("After a *= 2: " + a);

        a /= 4; // Division assignment
        System.out.println("After a /= 4: " + a);

        a %= 3; // Modulus assignment
        System.out.println("After a %= 3: " + a);


        // -------------------- Student Exercises --------------------

        // 1. Variable b
        int b = 20;
        b += 10; // Add 10
        System.out.println("b after += 10: " + b);
        b -= 5;  // Subtract 5
        System.out.println("b after -= 5: " + b);

        // 2. Variable c
        int c = 15;
        c *= 3; // Multiply by 3
        System.out.println("c after *= 3: " + c);
        c /= 2; // Divide by 2
        System.out.println("c after /= 2: " + c);

        // 3. Use %= with c
        c %= 4;
        System.out.println("c after %= 4: " + c);

        // 4. Double variable d
        double d = 12.5;
        d += 7.5; // Add 7.5
        System.out.println("d after += 7.5: " + d);
        d *= 2;   // Multiply by 2
        System.out.println("d after *= 2: " + d);

        // 5. Variable x
        int x = 7;
        x += x;   // Double value
        System.out.println("x after += x: " + x);
        x *= x;   // Square value
        System.out.println("x after *= x: " + x);

        // 6. Sequence with y
        int y = 50;
        System.out.println("Initial y: " + y);
        y -= 10;
        System.out.println("y after -= 10: " + y);
        y *= 2;
        System.out.println("y after *= 2: " + y);
        y /= 5;
        System.out.println("y after /= 5: " + y);
        y %= 6;
        System.out.println("y after %= 6: " + y);
    }
}