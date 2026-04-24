import java.util.*;

public class TrainConsistManagementSystem {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true; // Match found → early termination
            }
        }

        return false; // No match found
    }

    public static void main(String[] args) {

        // Sample bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform Linear Search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}