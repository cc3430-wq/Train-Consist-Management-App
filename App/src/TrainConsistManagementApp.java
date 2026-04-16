import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {



        public static void main(String[] args) {

            // Welcome Message
            System.out.println("=== Train Consist Management App ===");

            // Initialize LinkedList for Train Consist
            LinkedList<String> trainConsist = new LinkedList<>();

            // Add bogies (Initial sequence)
            trainConsist.add("Engine");
            trainConsist.add("Sleeper");
            trainConsist.add("AC");
            trainConsist.add("Cargo");
            trainConsist.add("Guard");

            System.out.println("\nInitial Train Consist:");
            System.out.println(trainConsist);

            // Insert Pantry Car at position 2
            trainConsist.add(2, "Pantry");

            System.out.println("\nAfter adding Pantry Car at position 2:");
            System.out.println(trainConsist);

            // Remove first and last bogie
            trainConsist.removeFirst();
            trainConsist.removeLast();

            System.out.println("\nAfter removing first and last bogie:");
            System.out.println(trainConsist);

            // Final ordered consist
            System.out.println("\nFinal Train Consist:");
            System.out.println(trainConsist);

            System.out.println("\nSystem maintains correct train order.");
        }
    }