package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        /**
         * Example of flatMap with list of lists
         */
        List<List<String>> listList = Arrays.asList(Arrays.asList("abc", "def", "ghi"), Arrays.asList("jkl", "mno", "pqr"));
        System.out.println("Before List flattening");
        System.out.println(listList);
        System.out.println("After List flattening");
        List<String> flattenList = listList.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());
//                          OR

//        List<String> flattenList = listList.stream()
//                .flatMap( l -> l.stream())
//                .collect(Collectors.toList());

        System.out.println(flattenList);

        /**
         * Example of flatMap using list of Maps
         */
        System.out.println("************************************************");

        Map<Integer, String> map1 = Map.of(1, "Manish", 2, "Supriya");
        Map<Integer, String> map2 = Map.of(3, "Shiva", 4, "Mahesh");
        List<Map<Integer, String>> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        System.out.println("Before Map flattening");
        System.out.println(mapList);
        System.out.println("After Map flattening");
        Map<Integer, String> flattenMap = mapList.stream()
                                                .flatMap(m -> m.entrySet().stream())
                                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(flattenMap);
    }
}
