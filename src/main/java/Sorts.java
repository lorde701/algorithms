import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorts {

    public static List<Integer> selectSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minValue = list.get(i);
            int minValueIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (minValue > list.get(j)) {
                    minValue = list.get(j);
                    minValueIndex = j;
                }
            }
            if (minValue < list.get(i)) {
                list.set(minValueIndex,list.get(i));
                list.set(i, minValue);
            }
        }
        return list;
    }

    public List<?> quickSort(List<? extends Comparable> list) {
        if (list.size() < 2) {
            return list;
        }
        else {
            List<Comparable> right = new ArrayList<Comparable>();
            List<Comparable> left = new ArrayList<Comparable>();
            int currentIndex = new Random().nextInt(list.size());
            for (int i = 1; i < list.size(); i++) {
                int compare = list.get(currentIndex).compareTo(list.get(i));
                if (compare > 0)
                    right.add(list.get(i));
                else
                    left.add(list.get(i));
            }

            left = (List<Comparable>) quickSort(left);
            left.add(list.get(currentIndex));
            left.addAll((List<Comparable>) quickSort(right));
            return left;
        }
    }
}
