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

            // Create a list of passenger bogies
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 40));

            // Display original list
            System.out.println("\nOriginal Bogie List:");
            bogies.forEach(System.out::println);

            // Sort bogies by capacity using Comparator
            bogies.sort(Comparator.comparingInt(b -> b.capacity));

            // Display sorted list
            System.out.println("\nSorted Bogie List by Capacity:");
            bogies.forEach(System.out::println);
        }
    }