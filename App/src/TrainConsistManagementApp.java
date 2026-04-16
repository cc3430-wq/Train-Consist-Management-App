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

            // Create list of bogies
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 40));
            bogies.add(new Bogie("Sleeper", 72)); // duplicate type for grouping demo
            bogies.add(new Bogie("AC Chair", 60)); // duplicate type for grouping demo

            // Display original list
            System.out.println("\nOriginal Bogie List:");
            bogies.forEach(System.out::println);

            // Group bogies by type/name using Collectors.groupingBy()
            Map<String, List<Bogie>> groupedBogies = bogies.stream()
                    .collect(Collectors.groupingBy(b -> b.name));

            // Display grouped bogies
            System.out.println("\nGrouped Bogie List by Type:");
            groupedBogies.forEach((type, list) -> {
                System.out.println(type + ":");
                list.forEach(b -> System.out.println("  " + b));
            });

            // Verify original list remains unchanged
            System.out.println("\nOriginal Bogie List Remains Unchanged:");
            bogies.forEach(System.out::println);
        }
    }