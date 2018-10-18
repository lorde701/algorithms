import java.util.HashMap;

/**
 * Created by Иванка on 18.10.2018.
 */
public class Graph {

//    public prepareGraph() {
//        HashMap<String, HashMap<String, Integer>> graph = new HashMap<String, HashMap<String, Integer>>();
//
//        HashMap<String, Integer> items = new HashMap<String, Integer>();
//        items.put("A", 6);
//        items.put("B", 2);
//        graph.put("start", items);
//        items.clear();
//        items.put("finish", 1);
//        graph.put("A", items);
//        items.clear();
//        items.put("A", 3);
//        items.put("finish", 5);
//        graph.put("B", items);
//        items.clear();
//        graph.put("finish", items);
//
//        HashMap<String, Integer> costs = new HashMap<String, Integer>();
//        costs.put("A", 6);
//        costs.put("B", 2);
//        costs.put("finish", Integer.MAX_VALUE);
//
//        HashMap<String, String> parents = new HashMap<String, String>();
//        parents.put("A", "start");
//        parents.put("B", "start");
//        parents.put("finish", null);
//
//        String node = findLowestCost(costs);
//        while (node != null) {
//
//        }
//
//        System.out.println(findLowestCost(costs));
//        System.out.println(findLowestCost(costs));
//        System.out.println(findLowestCost(costs));
//    }
//
//    private static String findLowestCost(HashMap<String, Integer> costs) {
//        int lowestCost = Integer.MAX_VALUE;
//        String lowestCostNode = null;
//        for (HashMap.Entry<String, Integer> it : costs.entrySet()) {
//            if ((it.getValue() < lowestCost) && (!processed.contains(it.getKey()))) {
//                lowestCost = it.getValue();
//                lowestCostNode = it.getKey();
//            }
//        }
//        processed.add(lowestCostNode);
//        return lowestCostNode;
//    }
}
