import java.io.File;

public class MyComparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String numberPattern = "\\d+";

        String[] path1 = String.valueOf(((File) o1).getAbsoluteFile()).split("(\\\\)");
        String[] path2 = String.valueOf(o2).split("(\\\\)");

        for (int iPath = 0; iPath < Math.min(path1.length, path2.length); iPath++) {
            String[] s1 = String.valueOf(path1[iPath]).split("(\\.| )");
            String[] s2 = String.valueOf(path2[iPath]).split("\\.| ");

            int i = 0;
            while (s1[i].matches(numberPattern) && s2[i].matches(numberPattern)) {
                int res = Integer.valueOf(s1[i]).compareTo(Integer.parseInt(s2[i]));
                if (res != 0) {
                    return res;
                }
                i++;
            }
            if (s1[i].matches(numberPattern))
                return -1;
            if (s2[i].matches(numberPattern))
                return 1;

            StringBuilder res1 = new StringBuilder();
            StringBuilder res2 = new StringBuilder();
            for (int j = i; j < s1.length; j++)
                res1.append(s1[j]).append(" ");
            for (int j = i; j < s2.length; j++)
                res2.append(s2[j]).append(" ");
            if (res1.toString().compareTo(res2.toString()) != 0)
                return res1.toString().compareTo(res2.toString());
        }
        return 0;

//        String[] s1 = String.valueOf(o1).split("(\\.| )");
//        String[] s2 = String.valueOf(o2).split("\\.| ");
//
//        int i = 0;
//        while (s1[i].matches(numberPattern) && s2[i].matches(numberPattern)) {
//            int res = Integer.valueOf(s1[i]).compareTo(Integer.parseInt(s2[i]));
//            if (res != 0) {
//                return res;
//            }
//            i++;
//        }
//        if (s1[i].matches(numberPattern))
//            return -1;
//        if (s2[i].matches(numberPattern))
//            return 1;
//
//        StringBuilder res1 = new StringBuilder();
//        StringBuilder res2 = new StringBuilder();
//        for (int j = i; j < s1.length; j++)
//            res1.append(s1[j]).append(" ");
//        for (int j = i; j < s2.length; j++)
//            res2.append(s2[j]).append(" ");
//        return res1.toString().compareTo(res2.toString());
    }
}
