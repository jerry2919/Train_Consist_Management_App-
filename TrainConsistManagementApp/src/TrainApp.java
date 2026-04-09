import java.util.LinkedList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry");

        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}