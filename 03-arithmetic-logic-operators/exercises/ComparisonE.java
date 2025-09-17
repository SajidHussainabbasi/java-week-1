/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables a = 50 and b = 25.
 *    - Check if a is equal to b.
 *    - Check if a is greater than b.
 *    - Check if a is less than or equal to b.
 *
 * 2. Create two double variables p = 5.5 and q = 7.2.
 *    - Compare p and q using >, <, and ==.
 *
 * 3. Create a char variable c1 = 'A' and c2 = 'B'.
 *    - Compare if c1 < c2 (hint: uses ASCII values).
 *
 * 4. Create a boolean expression that checks if:
 *    - x (10) is less than y (20) **AND** x is not equal to y.
 *
 * Bonus:
 * 5. Compare two strings (e.g., "Hello" and "World") using `.equals()`
 *    instead of `==`, and explain the difference.
 *
 * 6. Create three int variables and find out which one is the largest
 *    using comparison operators (no `Math.max`).
 * -------------------------------------------------------------
 */

public class ComparisonE
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;

        // Existing examples
        boolean isEqual = (x == y);
        System.out.println("Is Equal: " + isEqual);

        boolean isNotEqual = (x != y);
        System.out.println("Is Not Equal: " + isNotEqual);

        boolean isGreater = (x > y);
        System.out.println("Is Greater: " + isGreater);

        boolean isLess = (x < y);
        System.out.println("Is Less: " + isLess);

        boolean isGreaterOrEqual = (x >= y);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);

        boolean isLessOrEqual = (x <= y);
        System.out.println("Is Less or Equal: " + isLessOrEqual);


        // -------------------- Student Exercises --------------------

        // 1. int a = 50, b = 25
        int a = 50;
        int b = 25;
        System.out.println("\n1. Comparisons for a = 50, b = 25:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));

        // 2. double p = 5.5, q = 7.2
        double p = 5.5;
        double q = 7.2;
        System.out.println("\n2. Comparisons for p = 5.5, q = 7.2:");
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p == q: " + (p == q));

        // 3. char c1 = 'A', c2 = 'B'
        char c1 = 'A';
        char c2 = 'B';
        System.out.println("\n3. Comparison for c1 = 'A', c2 = 'B':");
        System.out.println("c1 < c2: " + (c1 < c2)); // uses ASCII values

        // 4. Boolean expression: (x < y) AND (x != y)
        boolean check = (x < y) && (x != y);
        System.out.println("\n4. (x < y) AND (x != y): " + check);

        // 5. Compare Strings using .equals()
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("\n5. String comparison using .equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("Note: Using == compares references, not content.");

        // 6. Find the largest of three ints
        int n1 = 12, n2 = 45, n3 = 30;
        int largest = n1; // assume n1 is largest
        if(n2 > largest) {
            largest = n2;
        }
        if(n3 > largest) {
            largest = n3;
        }
        System.out.println("\n6. Largest of n1 = 12, n2 = 45, n3 = 30: " + largest);
    }
}
