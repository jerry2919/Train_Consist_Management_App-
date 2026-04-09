import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " : " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");

        for (Bogie b : filtered) {
            System.out.println(b);
        }

        System.out.println("\nUC8 operations completed successfully...");
    }
}