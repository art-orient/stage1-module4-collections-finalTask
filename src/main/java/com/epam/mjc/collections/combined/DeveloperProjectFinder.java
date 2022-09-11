package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                list.add(entry.getKey());
            }
        }
        list.sort(new LengthComparator());
        return list;
    }

    static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int result = o2.length() - o1.length();
            if (result == 0) {
                result = o2.compareTo(o1);
            }
            return result;
        }
    }
}
