package jep269;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollection {

    public static void main(String[] args) {
        Set<Integer> set = Set.of(1,2,3);
        System.out.println("Order is not guaranteed");
        set.stream().forEach(System.out::println);

        try {
            set.add(4);
        } catch(UnsupportedOperationException e) {
            System.out.println("set is immutable !!!");
        }
        System.out.println();

        List<Integer> list = List.of(1,2,3);
        System.out.println("Order is guaranteed");
        list.stream().forEach(System.out::println);

        try {
            list.add(4);
        } catch(UnsupportedOperationException e) {
            System.out.println("list is immutable !!!");
        }
        System.out.println();

        Map<String, Integer> map = Map.of("1", 1, "2", 2, "3",3);
        map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        try {
            map.put("4", 4);
        } catch(UnsupportedOperationException e) {
            System.out.println("map is immutable !!!");
        }

    }
}
