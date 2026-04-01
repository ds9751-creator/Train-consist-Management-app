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