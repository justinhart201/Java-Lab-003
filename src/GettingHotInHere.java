import java.util.Scanner; // Import the Scanner class

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        double fahrenheit, celsius; // Declare two variables of double type
        System.out.print("Enter temperature in Fahrenheit: "); // Prompt the user to enter temperature in Fahrenheit
        fahrenheit = input.nextDouble(); // Read user input as a double value
        celsius = (fahrenheit - 32) * 5.0 / 9.0; // Calculate celsius value using the formula
        System.out.println("The " + fahrenheit + "°F you typed"); // Print fahrenheit value
        System.out.println("The " + celsius + "°C you converted as a floating point number"); // Print celsius value as a floating point number
        System.out.println("The " + (int) celsius + "°C as an integer"); // Print celsius value as an integer
        System.out.println("If it were 2°C warmer it would be: " + (celsius + 2) + "°C"); // Print the string with some arithmetic and concatenation operations
        input.close(); // Close the input object
    }
}

