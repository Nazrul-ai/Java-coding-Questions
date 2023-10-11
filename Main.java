import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Shuffle the list
        Collections.shuffle(list);

        // Print the shuffled list
        System.out.println("Shuffled Array: " + list);
    }
}
