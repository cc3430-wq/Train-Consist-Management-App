import java.util.*;

public class TrainApp {

    // Search with defensive validation
    public static boolean searchBogie(String[] bogies, String key) {

        // Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear search (can be replaced with previous UC logic)
        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Example dataset (can be empty or filled for testing)
        String[] bogies = {"BG101", "BG205", "BG309"};

        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            boolean result = searchBogie(bogies, key);

            if (result) {
                System.out.println("Bogie FOUND");
            } else {
                System.out.println("Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}