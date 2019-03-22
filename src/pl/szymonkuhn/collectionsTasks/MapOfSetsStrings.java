package pl.szymonkuhn.collectionsTasks;

import java.util.*;

public class MapOfSetsStrings {
    private Map<String, Set<String>> stringSetMap = new HashMap<>();

    public Map<String, Set<String>> createMapOfSets(String... strings) {
        outer: for (String string : strings) {
            String firstLetter = string.substring(0, 1);
            for (String key : stringSetMap.keySet()) {
                if (firstLetter.equalsIgnoreCase(key.substring(0, 1))) {
                    stringSetMap.get(key).add(string);
                    continue outer;
                }
            }
            Set<String> set = new HashSet<>();
            set.add(string);
            stringSetMap.put(firstLetter, set);
        }
        return this.stringSetMap;
    }

    public Map<String, Set<String>> addString (String stringToAdd) {
        String firstLetter = stringToAdd.substring(0,1);
        for (String key : stringSetMap.keySet()) {
            if (firstLetter.equalsIgnoreCase(key)) {
                stringSetMap.get(key).add(stringToAdd);
                return stringSetMap;
            }
        }
        Set<String> set = new HashSet<>();
        set.add(stringToAdd);
        stringSetMap.put(firstLetter, set);
        return stringSetMap;
    }

    public Set<String> getSet (String stringKey) {
        return stringSetMap.get(stringKey.substring(0,1).toLowerCase());
    }

    public int getNumberOfSet (String stringKey) {
        return stringSetMap.get(stringKey.substring(0,1).toLowerCase()).size();
    }

    public Map<String, Set<String>> getStringSetMap() {
        return stringSetMap;
    }
}
