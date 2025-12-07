import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking input for age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Printing name and age
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}
