/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable num = 8.
 *    - Apply unary minus and print the result.
 *    - Apply unary plus and print the result.
 *
 * 2. Create a boolean variable isOpen = false.
 *    - Use logical NOT (!) to invert its value and print it.
 *
 * 3. Create an int variable counter = 0.
 *    - Use pre-increment (++counter) and print the value.
 *    - Use post-increment (counter++) and print the value.
 *
 * 4. Create an int variable count = 5.
 *    - Use pre-decrement (--count) and print the value.
 *    - Use post-decrement (count--) and print the value.
 *
 * Bonus:
 * 5. Combine unary operators with arithmetic:
 *    Example: int x = 10; int y = -x + ++x; print y and explain.
 * -------------------------------------------------------------
 */

public class UnaryE
{
    public static void main(String[] args) {
        int a = 5;
        int b = -a; // Unary minus
        int c = +a; // Unary plus
        boolean flag = true;
        boolean notFlag = !flag; // Logical NOT
        int x = 10;
        x++; // Increment
        int y = 10;
        y--; // Decrement

        System.out.println("Original a: " + a);
        System.out.println("Unary minus b: " + b);
        System.out.println("Unary plus c: " + c);
        System.out.println("Original flag: " + flag);
        System.out.println("Logical NOT notFlag: " + notFlag);
        System.out.println("Incremented x: " + x);
        System.out.println("Decremented y: " + y);

        // -------------------- Student Exercises --------------------

        // 1. Unary minus and plus
        int num = 8;
        System.out.println("\n1. Unary operations on num = " + num);
        System.out.println("Unary minus: " + (-num)); // -8
        System.out.println("Unary plus: " + (+num));  // 8

        // 2. Logical NOT
        boolean isOpen = false;
        System.out.println("\n2. Logical NOT on isOpen = " + isOpen);
        System.out.println("Inverted: " + (!isOpen)); // true

        // 3. Pre-increment and post-increment
        int counter = 0;
        System.out.println("\n3. Counter operations:");
        System.out.println("Pre-increment (++counter): " + (++counter)); // 1
        System.out.println("Post-increment (counter++): " + (counter++)); // 1, then counter becomes 2
        System.out.println("Counter after post-increment: " + counter); // 2

        // 4. Pre-decrement and post-decrement
        int count = 5;
        System.out.println("\n4. Count operations:");
        System.out.println("Pre-decrement (--count): " + (--count)); // 4
        System.out.println("Post-decrement (count--): " + (count--)); // 4, then count becomes 3
        System.out.println("Count after post-decrement: " + count); // 3

        // 5. Combine unary operators with arithmetic
        int x2 = 10;
        int y2 = -x2 + ++x2; // -10 + 11 = 1
        System.out.println("\n5. Combined unary operators:");
        System.out.println("x2 = 10; y2 = -x2 + ++x2 => y2: " + y2);
    }
}