import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        double m1 = input.nextDouble();
        double m2 = input.nextDouble();
        double m3 = input.nextDouble();
        double m4 = input.nextDouble();
        double m5 = input.nextDouble();

        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
