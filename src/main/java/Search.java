import java.util.List;

public class Search {

    public static Integer binarySearch(List<String> list, String findElement) {
        int startIndex = 0;
        int finishIndex = list.size() - 1;
        int indexCurrentElement;
        while (Math.abs(startIndex - finishIndex) > 1) {
            indexCurrentElement = (int) (Math.ceil((finishIndex + startIndex) / 2.0));
            int compareRes = list.get(indexCurrentElement).compareTo(findElement);
            if (compareRes > 0)
                finishIndex = indexCurrentElement;
            else if (compareRes < 0)
                startIndex = indexCurrentElement;
            else if (compareRes == 0)
                return indexCurrentElement;
        }
        return null;
    }
}
