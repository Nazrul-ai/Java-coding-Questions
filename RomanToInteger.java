import java.util.ArrayList;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer Value: " + result);
        scanner.close();
    }

    public static int romanToInteger(String s) {
        ArrayList<Integer> values = new ArrayList<>();

        for (char c : s.toCharArray()) {
            int value = getValue(c);
            if (value != -1) {
                values.add(value);
            }
        }

        int result = 0;
        int prevValue = 0;

        for (int i = values.size() - 1; i >= 0; i--) {
            int currentValue = values.get(i);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static int getValue(char c) {
        // Define the values for Roman numerals
        ArrayList<Character> romanNumerals = new ArrayList<>();
        romanNumerals.add('I');
        romanNumerals.add('V');
        romanNumerals.add('X');
        romanNumerals.add('L');
        romanNumerals.add('C');
        romanNumerals.add('D');
        romanNumerals.add('M');

        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(5);
        values.add(10);
        values.add(50);
        values.add(100);
        values.add(500);
        values.add(1000);

        for (int i = 0; i < romanNumerals.size(); i++) {
            if (c == romanNumerals.get(i)) {
                return values.get(i);
            }
        }

        return -1; // Return -1 for invalid characters
    }
}
