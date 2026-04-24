import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public class TrainApp {

    // Safety validation method
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        // Rule: If Cylindrical → only Petroleum allowed
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample data
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Validate safety
        boolean isSafe = isTrainSafe(bogies);

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFETY COMPLIANT");
        }
    }
}