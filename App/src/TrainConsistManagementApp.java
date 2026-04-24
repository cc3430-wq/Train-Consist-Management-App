import java.util.Arrays;

public class TrainConsistManagementApp {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames); // Built-in sorting
    }

    public static void main(String[] args) {

        // Sample bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        sortBogieNames(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}