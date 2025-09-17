/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two boolean variables x = true, y = false.
 *    - Use && to check if both are true.
 *    - Use || to check if at least one is true.
 *    - Use ! to invert their values and print results.
 *
 * 2. Create three boolean variables a = true, b = false, c = true.
 *    - Evaluate the expression: (a && b) || c and print the result.
 *    - Evaluate the expression: !(a || b) && c and print the result.
 *
 * 3. Write a condition to check if a number n = 15 is:
 *    - Greater than 10 **AND** less than 20.
 *    - Not equal to 12 **OR** less than 5.
 *
 * Bonus:
 * 4. Combine multiple logical operators with parentheses
 *    to control the order of evaluation and test different cases.
 * -------------------------------------------------------------
 */

public class LogicalE
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("Logical AND (&&):");
        System.out.println("true && true = " + (a && a));   // true
        System.out.println("true && false = " + (a && b));  // false
        System.out.println("false && false = " + (b && b)); // false

        // Logical OR
        System.out.println("\nLogical OR (||):");
        System.out.println("true || true = " + (a || a));   // true
        System.out.println("true || false = " + (a || b));  // true
        System.out.println("false || false = " + (b || b)); // false

        // Logical NOT
        System.out.println("\nLogical NOT (!):");
        System.out.println("!true = " + (!a));   // false
        System.out.println("!false = " + (!b));  // true


        // -------------------- Student Exercises --------------------

        // 1. Boolean x and y
        boolean x = true;
        boolean y = false;
        System.out.println("\n1. Boolean x = true, y = false:");
        System.out.println("x && y = " + (x && y));  // false
        System.out.println("x || y = " + (x || y));  // true
        System.out.println("!x = " + (!x));          // false
        System.out.println("!y = " + (!y));          // true

        // 2. a = true, b = false, c = true
        boolean c = true;
        System.out.println("\n2. Logical expressions with a, b, c:");
        System.out.println("(a && b) || c = " + ((a && b) || c));       // true
        System.out.println("!(a || b) && c = " + (!(a || b) && c));     // false

        // 3. n = 15
        int n = 15;
        System.out.println("\n3. Number n = 15 conditions:");
        System.out.println("n > 10 && n < 20: " + (n > 10 && n < 20)); // true
        System.out.println("n != 12 || n < 5: " + (n != 12 || n < 5)); // true

        // 4. Combined logical operators with parentheses
        System.out.println("\n4. Combined logical expressions:");
        boolean result1 = (x || y) && (a && !b);  // true
        boolean result2 = !(x && a) || (b || c);  // true
        boolean result3 = ((n > 10 && n < 20) || (n == 15 && x)) && !y; // true
        System.out.println("(x || y) && (a && !b) = " + result1);
        System.out.println("!(x && a) || (b || c) = " + result2);
        System.out.println("((n > 10 && n < 20) || (n == 15 && x)) && !y = " + result3);
    }
}