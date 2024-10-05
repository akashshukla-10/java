import java.util.Scanner;

public class VowelChecker {

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert character to lowercase for case-insensitive checking
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Display vowels found in the string
        System.out.println("Vowels in the string are: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
        
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
