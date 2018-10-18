import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
//        String pat = "(\\d+)";
//        String str = " Документ создан успешно (3437838) ьвбывт 4548 дываршыгар 879 лугаплыа 45648";

//        String res = regexp("Документ создан успешно (3437838)", "(\\d+)");
//        System.out.println(Pattern.compile("(\\d+)").matcher(" Документ создан успешно (3437838)").group(1));
//        String res = regexp(str, pat);
//        System.out.println(res);
//        regexp(str, pat);
        //System.out.println(regexp(str, pat));
//        System.out.println(Pattern.compile(pat).matcher(str).group(1));
        List<String> m = Arrays.asList("3.2.2.2.1 Назначение Ответственного менеджера по прецеденту в1.xml",
                "3.2.2.2.3 Переназначение ответственного подразделения.xml",
                "3.2.2.2.2 Принятие прецедента в работу в1.xml",
                "3.2.2.2.10 Назначение Ответственного менеджера по прецеденту в1.xml",
                "1111",
                "валыд ываы.вы.выа",
                "2.1 Првыорпа а",
                "2.4 ваы",
                "2.10 лдвыа ва ыфвывфы",
                "3.2.3.2.10 Назначение  менеджера по прецеденту в1.xml",
                "3.2.10.2.10 Назначение Ответственного менеджера по прецеденту в1.xml",
                "3.2.10.2.10 НазначениеОтветственного менеджера по прецеденту в1.xml",
                "3.2.12.2.10 Назначение менеджерапопрецедентув1.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.1 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.1 Назначение Ответственного менеджера по прецеденту.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.1 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.1 Создание карточки.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.1 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.10 Согласование решения по прецеденту.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.1 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.6 Принятие прецедента в работу в2.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.1 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.1 Назначение Ответственного менеджера по прецеденту.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.2 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.1 Создание карточки.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.2 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.10 Согласование решения по прецеденту.xml",
                "E:\\IStetsyuk\\SED_new\\AT_SED\\Tests\\SED\\1.2 Создание карточки прецедента по договрным отношениям для роли Юрист ПИР (Исходящий) Вариант 112121\\1.1.2.6 Принятие прецедента в работу в2.xml",
                "",
                "3.2.3.2.10 Назначение Ответственного менеджера по прецеденту в1.xml");
        MyComparator myComparator = new MyComparator();
        List<String> sorted = (List<String>) m.stream().sorted(myComparator).collect(Collectors.toList());
        sorted.forEach(System.out::println);


//        List<String> newList = m.stream()
//                .sorted(
//                        (e1, e2) -> {
//                            String[] s1 = e1.split("(\\.| )");
//                            String[] s2 = e2.split("\\.| ");
//
//                            int i = 0;
//
//                            while(s1[i].matches("//d+") && s2[i].matches("//d+")) {
//                                if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[i])) {
//                                    return Integer.parseInt(e2);
//                                }
//                                i++;
//                            }
//
////                            for (int i = 0; i < Math.min(s1.length, s2.length); i++) {
////                                int result = s1[i].compareTo(s2[i]);
////                                if (result != 0) return result;
////                            }
//                            return Integer.valueOf(s1[1]).compareTo(Integer.valueOf(s2[1]));
//                           // return Math.min(s1.length, s2.length);
//                        }
//                ).collect(Collectors.toList());
//
//        int i = 0;
    }

    private static void regexp(String inputStr, String pattern) throws RuntimeException {
        Matcher m = Pattern.compile(pattern).matcher(inputStr);
        while (m.find())
            System.out.println(m.group());
    }
}
