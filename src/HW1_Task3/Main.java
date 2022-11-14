package HW1_Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        addToMap(map, "str1", 2);
        addToMap(map, "str2", 1);
        addToMap(map, "str1", 2);
        addToMap(map, "str1", 5);
        System.out.println(map);
    }

    public static <S, I> void addToMap(Map<S, I> map, S key, I value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
            return;
        }
        if (map.get(key).equals(value)) {
            throw new IllegalArgumentException("Коллекция уже хранит такие параметры");
        } else {
            map.put(key, value);
        }


    }
}


