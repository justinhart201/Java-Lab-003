import java.util.Scanner; // Import the Scanner class

public class MrRoboto {
    public static void main(String[] args) {
        String domo = "Domo arigato ";
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("My name is Mr. Roboto, are you Kilroy?");
        String userInput = scanner.nextLine(); // Read user input
        System.out.println(userInput + domo); // Output user input concatenated with domo
        scanner.close(); // Close the scanner object
    }
}
