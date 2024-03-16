import java.util.Scanner;

public class TimiDocker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter their name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        // Displaying the greeting message with the user's name
        System.out.println("Hello, " + name);
    }
}
