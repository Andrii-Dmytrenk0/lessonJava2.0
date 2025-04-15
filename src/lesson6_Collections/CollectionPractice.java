package src.lesson6_Collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Andrii");
        list.add("Alex");
        list.add("Anastasia");
        list.add("Yana");

        list.remove(3);

        for (String students : list) {
            System.out.println(students);
        }

        Set<String> age = new HashSet<>();
        age.add("24");
        age.add("23");

        Map<String, Integer> map = new HashMap<>();
        map.put("Andrii",24);
        map.put("Alex",23);
        map.put("Anastasia",24);
        map.put("Yana",23);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
