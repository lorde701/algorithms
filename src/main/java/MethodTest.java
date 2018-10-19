import java.lang.reflect.Array;
import java.util.*;

public class MethodTest {
    public static void main(String[] args) {
        testGraph();
    }

    private static void testGraph() {

        ArrayList<String> processed = new ArrayList<>();

        //prepare data
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        HashMap<String, Integer> items = new HashMap<>();
        items.put("A", 6);
        items.put("B", 2);
        graph.put("start", items);
        items = new HashMap<>();
        items.put("finish", 1);
        graph.put("A", items);
        items = new HashMap<>();
        items.put("A", 3);
        items.put("finish", 5);
        graph.put("B", items);
        items = new HashMap<>();
        graph.put("finish", items);

        HashMap<String, Integer> costs = new HashMap<>();
        costs.put("A", 6);
        costs.put("B", 2);
        costs.put("finish", Integer.MAX_VALUE);

        HashMap<String, String> parents = new HashMap<>();
        parents.put("A", "start");
        parents.put("B", "start");
        parents.put("finish", null);

        //search
        String min = Graph.findLowestCost(costs, processed);
        while (min != null) {
            HashMap<String, Integer> elements = graph.get(min);
            for (HashMap.Entry<String, Integer> element : elements.entrySet()) {
                if (costs.get(min) + element.getValue() < costs.get(element.getKey())) {
                    costs.put(element.getKey(), costs.get(min) + element.getValue());
                    parents.put(element.getKey(), min);
                }
            }
            processed.add(min);
            min = Graph.findLowestCost(costs, processed);
        }

        //result
        System.out.println();
        System.out.println("Стоимости");
        for (Map.Entry<String, Integer> el : costs.entrySet()) {
            System.out.println(el.getKey() + " : " + el.getValue());
        }

        System.out.println();
        System.out.println("Родители");
        for (Map.Entry<String, String> el : parents.entrySet()) {
            System.out.println(el.getKey() + " : " + el.getValue());
        }

        ArrayList<String> route = new ArrayList<>();
        System.out.println();
        System.out.println("Маршрут");
        String currentNode = "finish";
        while (!currentNode.equals("start")) {
            route.add(currentNode);
            currentNode = parents.get(currentNode);
        }
        route.add("start");
        for (int i = route.size() - 1; i >= 0; i--) {
            System.out.print(route.get(i));
            if (i != 0) {
                System.out.print(" -> ");
            }
        }
    }

    private static void testRecursionBinarySearch() {
        String findEl = "hgnsdf";

        List<String> list = Arrays.asList(
                "ssaf",
                "gdvx",
                "hgnsdf",
                "dfewww",
                "dsseew",
                "dcs",
                "sdf",
                "as",
                "vdffs"
        );
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
        Integer i = Recursion.binarySearch(list, findEl);
        System.out.println(String.format("Элемент <%s> находится в списке под индексом <%d>", findEl, i));
    }


    private static void testMaxListElement() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(100));
        }
        list.forEach(System.out::println);
        System.out.println();

//        System.out.println("Реальное количество элементов: " + list.size());
        System.out.println("Max элемент (рекурсия): " + Recursion.maxListElement(list));
    }

    private static void testCountListElements() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2004; i++) {
            Random random = new Random();
            list.add(random.nextInt(10));
        }
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Реальное количество элементов: " + list.size());
        System.out.println("Количество элементов (рекурсия): " + Recursion.countListElements(list));
    }

    private static void testSumListElements() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(10));
        }
        list.forEach(System.out::println);
        System.out.println();


        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Сумма элементов (цикл): " + sum);
        System.out.println("Сумма элементов (рекурсия): " + Recursion.sumListElements(list));
    }

    private static void testFactorial() {
        System.out.println(Recursion.factorial(10));
    }


    private static void testSelectSort() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            list.add(random.nextInt(1000));
        }

        list.forEach(System.out::println);
        System.out.println();
        list = Sorts.selectSort(list);

        list.forEach(System.out::println);
    }



    private static void testBinarySearch() {
        String findEl = "dfdsfsdf ";

        List<String> list = Arrays.asList(
                "ssaf",
                "gdvx",
                "hgnsdf",
                "dfewww",
                "dsseew",
                "dcs",
                "sdf",
                "as",
                "vdffs"
        );
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
        Integer i = Search.binarySearch(list, findEl);
        System.out.println(String.format("Элемент <%s> находится в списке под индексом <%d>", findEl, i));
    }
}
