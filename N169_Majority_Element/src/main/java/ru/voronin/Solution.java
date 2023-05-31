package ru.voronin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, ++value);
            } else {
                map.put(i, 1);
            }
        }
        int maxValue = Collections.max(map.values());
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                return entry.getKey();
            }
        }
        return maxKey;
    }
}
