import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (dividend): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (divisor): ");
        int b = sc.nextInt();

        int quotient = a / b;     // division
        int remainder = a % b;    // modulus

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
