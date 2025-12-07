public class IncDecDemo {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Initial value of x: " + x);

        // Post-increment
        System.out.println("x++ = " + (x++)); // prints old value, then increments
        System.out.println("After x++ , x = " + x);

        // Pre-increment
        System.out.println("++x = " + (++x)); // increments first, then prints

        // Post-decrement
        System.out.println("x-- = " + (x--)); // prints old value, then decrements
        System.out.println("After x-- , x = " + x);

        // Pre-decrement
        System.out.println("--x = " + (--x)); // decrements first, then prints
    }
}
