package Lesson08.homework08;

import java.util.HashMap;
import java.util.Map;
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int max = 0;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("===> " + maxKey);
    }
}

