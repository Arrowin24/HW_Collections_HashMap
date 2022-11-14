package HW2_Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();

        addToCollection(map,5);
        System.out.println("Первоначальная коллекция:");
        print(map);
        System.out.println("Новая коллекция:");
        print(reformatToSumValues(map));
    }

    //Преобразование первоначальной Мапы в Мапу с суммой...
    public static Map<String,Integer> reformatToSumValues(Map<String, List<Integer>> map){
        Map<String,Integer> sums = new HashMap<>();
        for (String str : map.keySet()) {
            int sum=0;
            for (Integer integer : map.get(str)) {
                sum+=integer;
            }
            sums.put(str,sum);
        }
        return sums;
    }

    //Добавляемс случайные 3 целых числа от 0 до 1000 в Мапу из строк
    public static void addToCollection(Map<String, List<Integer>> map, int numOfElements) {
        int listSize=3;
        for (int i = 0; i < numOfElements; i++) {
            List<Integer> list = new ArrayList<>(listSize);
            for(int j=0;j<listSize;j++){
                list.add((int)(Math.random()*1000));
            }
            map.put("string"+(i+1),list);
        }
    }

    //выводим Мапу в формате "Key" -> Value
    public static <S,I> void print(Map<S,I> map){
        StringBuilder stringBuilder = new StringBuilder();
        for (S s : map.keySet()) {
            stringBuilder.append(s).append(" -> ").append(map.get(s)).append("\n");
        }
        System.out.println(stringBuilder);
    }


}

