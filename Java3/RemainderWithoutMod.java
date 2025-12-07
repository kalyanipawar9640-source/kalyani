import java.util.Scanner;

public class RemainderWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calculating remainder without using %
        int quotient = dividend / divisor;
        int remainder = dividend - (divisor * quotient);

        System.out.println("Remainder: " + remainder);
    }
}
