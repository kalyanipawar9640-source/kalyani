import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char firstChar = text.charAt(0);   // get first character

        System.out.println("First character: " + firstChar);

        sc.close();
    }
}
