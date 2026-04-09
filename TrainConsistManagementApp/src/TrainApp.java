import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("===================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted Bogies by Capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}