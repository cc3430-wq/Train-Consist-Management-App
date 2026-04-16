import java.util.ArrayList;
import java.util.List;




    class Bogie {
        String type;
        int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + " seats)";
        }
    }

    public class  TrainConsistManagementApp {

        public static void main(String[] args) {

            // Creating list of bogies
            List<Bogie> bogies = new ArrayList<>();

            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 54));
            bogies.add(new Bogie("First Class", 24));

            // Stream pipeline: map + reduce
            int totalSeats = bogies.stream()
                    .map(Bogie::getCapacity)   // Extract capacity
                    .reduce(0, Integer::sum); // Aggregate total

            // Display result
            System.out.println("Total Seating Capacity: " + totalSeats);
        }
    }