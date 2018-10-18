import java.util.List;

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
}
