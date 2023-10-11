import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check for pangram: ");
        String inputSentence = scanner.nextLine();
        boolean isPangram = checkPangram(inputSentence);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    public static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // Array to track presence of each letter
        
        // Convert the sentence to uppercase for case-insensitive check
        String uppercaseSentence = sentence.toUpperCase();
        
        // Iterate through each character in the sentence
        for (char c : uppercaseSentence.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // Set the corresponding letter as "seen"
                alphabet[c - 'A'] = true;
            }
        }
        
        // Check if all letters have been "seen" (i.e., are true in the array)
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is not seen, it's not a pangram
            }
        }
        
        return true; // All letters are seen, it's a pangram
    }
}
