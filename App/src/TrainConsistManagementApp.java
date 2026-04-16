import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

        public static void main(String[] args) {


            System.out.println("=== Train Consist Management App ===");


            Set<String> bogieIds = new HashSet<>();


            bogieIds.add("BG101");
            bogieIds.add("BG102");
            bogieIds.add("BG103");
            bogieIds.add("BG101"); // duplicate
            bogieIds.add("BG102"); // duplicate


            System.out.println("\nUnique Bogie IDs in Train:");
            System.out.println(bogieIds);


            System.out.println("\nTotal Unique Bogies: " + bogieIds.size());


            System.out.println("\nSystem ensures no duplicate bogie IDs.");
        }
    }