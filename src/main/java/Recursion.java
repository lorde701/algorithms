import java.util.List;

public class Recursion {

    static long factorial(int i) {
        if (i > 1)
            return i * factorial(i - 1);
        else if (i == 1 || i == 0)
            return 1;
        else
            throw new RuntimeException("Нельзя получить факториал для заданного числа");

    }

    static long sumListElements(List<Integer> list) {
        if (list.size() == 0)
            return 0;
        else if (list.size() == 1)
            return list.get(0);
        else
            return list.get(0) + sumListElements(list.subList(1, list.size()));
    }

    static int countListElements(List<?> list) {
        if (list.size() == 0)
            return 0;
        else
            return 1 + countListElements(list.subList(1, list.size()));
    }

    static int maxListElement(List<Integer> list) {
        if (list.size() == 1)
            return list.get(0);
        else {
            list.set(1, Math.max(list.get(0), list.get(1)));
            return maxListElement(list.subList(1, list.size()));
        }
    }

    static Integer binarySearch(List<String> list, String el) {
        if (list.size() == 1)
            return null;
        int middleIndex = (int) (Math.ceil((list.size() - 1) / 2.0));
        int compare = list.get(middleIndex).compareTo(el);
        if (compare == 0) {
            return middleIndex;
        } else if (compare > 0) {
            return binarySearch(list.subList(0, middleIndex + 1), el);
        } else
            return binarySearch(list.subList(middleIndex, list.size()), el);
    }
}


