import java.util.Scanner;

public class SquareCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the square: ");
        double side = sc.nextDouble();

        double area = side * side;            // area = side²
        double perimeter = 4 * side;          // perimeter = 4 × side

        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);

        sc.close();
    }
}
