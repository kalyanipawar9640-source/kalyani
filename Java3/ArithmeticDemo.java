public class ArithmeticDemo {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        // Basic arithmetic operators
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        // Increment and Decrement
        int x = 7;
        System.out.println("\nOriginal x = " + x);
        System.out.println("Post-increment (x++) = " + (x++));
        System.out.println("After post-increment x = " + x);

        int y = 7;
        System.out.println("\nOriginal y = " + y);
        System.out.println("Pre-increment (++y) = " + (++y));

        int p = 7;
        System.out.println("\nOriginal p = " + p);
        System.out.println("Post-decrement (p--) = " + (p--));
        System.out.println("After post-decrement p = " + p);

        int q = 7;
        System.out.println("\nOriginal q = " + q);
        System.out.println("Pre-decrement (--q) = " + (--q));
    }
}
