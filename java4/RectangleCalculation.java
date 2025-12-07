import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = input.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}
