package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeKSortedArrayListUsingJava8 {

    private static List<Integer> mergeKSortedList(List<Integer>[] lists) {
        return Arrays.stream(lists).flatMap(list -> list.stream()).sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer>[] lists = new List[4];
        List<Integer> list1 = List.of(1, 5, 8, 12);
        List<Integer> list2 = List.of(2, 6, 9, 11);
        List<Integer> list3 = List.of(3, 4, 8, 15);
        List<Integer> list4 = List.of(5, 9, 14, 20);
        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;
        lists[3] = list4;
        List<Integer> list = mergeKSortedList(lists);
        System.out.println(list);
        
    }
}
