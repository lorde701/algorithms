import java.lang.reflect.Array;
import java.util.*;

public class MethodTest {
    public static void main(String[] args) {
        testSumListElements();
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
