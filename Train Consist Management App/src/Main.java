import java.util.ArrayList;
import java.util.List;
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

    }
}
