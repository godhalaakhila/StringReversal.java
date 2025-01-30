import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using a simple method
        String reversedString = "";
        
        // Loop through the string from the end to the start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
 
    

