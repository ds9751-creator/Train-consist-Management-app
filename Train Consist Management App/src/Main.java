import java.util.ArrayList;
import java.util.List;

public class Main {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
import java.util.stream.Collectors;

public class Main {

    // ===================== BOOGIE MODEL =====================

public class UseCase10TrainConsistMgmnt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==============================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // Safety Violation

        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie gb : goodsBogies) {
            System.out.println(gb.type + " -> " + gb.cargo);
        }

        // ---- APPLY SAFETY VALIDATION RULE ----
        // Rule: If type is Cylindrical, cargo must be Petroleum
        boolean isSafe = goodsBogies.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Other types are safe by default in this context
        });

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");

        System.out.println("==============================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==============================================\n");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("TYPE-" + i, (i % 100)));
        }

        // ===================== LOOP VERSION =====================
        long startLoop = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ===================== STREAM VERSION =====================
        long startStream = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ===================== OUTPUT =====================
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime + "\n");

        System.out.println("Loop Result Size: " + loopFiltered.size());
        System.out.println("Stream Result Size: " + streamFiltered.size());

        System.out.println("\nUC13 performance benchmarking completed...");
        System.out.println("==============================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==============================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
        System.out.println("\nUC10 aggregation completed...");
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}
