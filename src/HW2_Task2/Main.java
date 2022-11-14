package HW2_Task2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        addToCollection(map,10);
        print(map);
    }

    public static void addToCollection(Map<Integer, String> map, int numOfElements) {
        for (int i = 0; i < numOfElements; i++) {
            map.put(i, Character.toString('a' + i));
        }
    }

    public static <S, I> void print(Map<S, I> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (S s : map.keySet()) {
            stringBuilder.append(s).append(" -> ").append(map.get(s)).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
