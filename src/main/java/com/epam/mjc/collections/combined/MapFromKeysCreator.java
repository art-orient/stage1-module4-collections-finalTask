package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            Set<String> set = map.get(s.length());
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(s);
            map.put(s.length(), set);
        }
        return map;
    }
}
