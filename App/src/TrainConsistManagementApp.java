import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {


        // Bogie class representing passenger bogies
        static class Bogie {
            String name;
            int capacity;

            Bogie(String name, int capacity) {
                this.name = name;
                this.capacity = capacity;
            }

            @Override
            public String toString() {
                return name + " (Capacity: " + capacity + ")";
            }
        }

        public static void main(String[] args) {
            System.out.println("=== Train Consist Management App ===");

            // Original bogie list
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 40));

            // Display original list
            System.out.println("\nOriginal Bogie List:");
            bogies.forEach(System.out::println);

            // Filter bogies with capacity > 60 using Stream API
            List<Bogie> highCapacityBogies = bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());

            // Display filtered bogies
            System.out.println("\nFiltered Bogie List (Capacity > 60):");
            highCapacityBogies.forEach(System.out::println);

            // Verify original list remains unchanged
            System.out.println("\nOriginal Bogie List Remains Unchanged:");
            bogies.forEach(System.out::println);
        }
    }