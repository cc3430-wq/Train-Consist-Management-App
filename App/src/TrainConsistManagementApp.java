import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {


        public static void main(String[] args) {
            System.out.println("=== Train Consist Management App ===");

            // Initialize LinkedHashSet for train formation
            LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

            // Attach bogies
            trainFormation.add("Engine");
            trainFormation.add("Sleeper");
            trainFormation.add("Cargo");
            trainFormation.add("Guard");

            // Attempt to attach a duplicate bogie (Sleeper)
            trainFormation.add("Sleeper"); // will be ignored automatically

            // Display the final train formation
            System.out.println("\nTrain Formation (Insertion Order Preserved, No Duplicates):");
            System.out.println(trainFormation);
        }
    }