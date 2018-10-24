import java.util.*;

public class GreedyAlgorithms {
    static Set<String> states = new HashSet<>(Arrays.asList("ID", "NV", "UT", "WA", "MT", "OR", "CA", "AZ"));

    private static Map<String, Set<String>> stations = new HashMap<>();
    static {
        Set<String> states = new HashSet<>(Arrays.asList("ID", "NV", "UT"));
        stations.put("kone", states);

        states = new HashSet<>(Arrays.asList("WA", "ID", "MT"));
        stations.put("ktwo", states);

        states = new HashSet<>(Arrays.asList("OR", "NV", "CA"));
        stations.put("kthree", states);

        states = new HashSet<>(Arrays.asList("NV", "UT"));
        stations.put("kfour", states);

        states = new HashSet<>(Arrays.asList("CA", "AZ"));
        stations.put("kfive", states);

    }



}
