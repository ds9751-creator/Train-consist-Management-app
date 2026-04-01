import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===       ");
        System.out.println("==============================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
import java.util.stream.Collectors;

public class Main {

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
public class Main{
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==============================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72)); // Adding another high-capacity bogie

        System.out.println("All Bogies in Consist:");
        bogies.forEach(System.out::println);

        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nHigh-Capacity Bogies (Capacity > 60):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No matching bogies found.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 stream filtering completed...");
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- Add bogie objects ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // ---- Sort by capacity using Comparator (Ascending) ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting by capacity completed...");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println("\nAfter Removing 'AC Chair':");
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==============================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==============================================\n");

        Set<String> bogies = new HashSet<>();

        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        bogies.add("B6101");
        bogies.add("B6102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
import java.util.LinkedList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==============================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        trainConsist.add(2, "Pantry Car");
        System.out.println(trainConsist);

        System.out.println("\nAfter Removing First and Last Bogie:");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}