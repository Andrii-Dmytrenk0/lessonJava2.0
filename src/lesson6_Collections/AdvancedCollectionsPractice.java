package src.lesson6_Collections;

import java.util.*;

public class AdvancedCollectionsPractice {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();
        student.add("Andrii");
        student.add("Alex");
        student.add("Oleg");
        student.add("Olga");
        student.add("Boris");
        student.add("Anstasia");
        student.add("Nastya");
        student.add("Yana");

        Collections.sort(student);

        System.out.println(student);


        for (String s : student) {
            boolean contains = s.contains("A");
            if(contains) {
                System.out.println(s);
            }
        }

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(10);
        set.add(5);
        set.add(11);
        set.add(56);
        set.add(23);
        set.add(12);
        set.add(1);

        System.out.println(set);

        List<Integer> set1 = new ArrayList<>();

        set1.addAll(set);
        Collections.sort(set1);
        System.out.println(set1);


        Map<String, List<Integer>> map = new HashMap<>();

        map.put("Andrii", List.of(2,3,4));
        map.put("Alex", List.of(2,5,3));
        map.put("Yana", List.of(4,4,1));
        map.put("Nastya", List.of(5,5,5));

        for (Map.Entry<String, List<Integer>> i : map.entrySet()) {
            List<Integer> estimates = i.getValue();
            var size = estimates.size();
            int sum = 0;

            System.out.println(estimates);
            for (Integer y : estimates) {
                sum = sum + y;
                System.out.println(sum);
            }
            int result = sum / size;
            System.out.println(result);
        }

    }
}
