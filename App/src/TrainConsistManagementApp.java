import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {


        public static void main(String[] args) {
            System.out.println("=== Train Consist Management App ===");

            // Initialize HashMap to store bogie-capacity mapping
            HashMap<String, Integer> bogieCapacity = new HashMap<>();

            // Insert bogies and their capacities
            bogieCapacity.put("Sleeper", 72);
            bogieCapacity.put("AC Chair", 60);
            bogieCapacity.put("First Class", 40);

            // Display bogie capacities
            System.out.println("\nBogie Capacities:");
            for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
                System.out.println(entry.getKey() + " => Capacity: " + entry.getValue());
            }
        }
    }