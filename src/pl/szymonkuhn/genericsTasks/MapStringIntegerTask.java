package pl.szymonkuhn.genericsTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapStringIntegerTask {
    private Map<String, Integer> stringIntegerMap = new HashMap<>();



    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void addWord(String wordToAdd){
        Set<String> keySet  = stringIntegerMap.keySet();
        for (String key : keySet) {
            if (wordToAdd.equals(key)) {
                Integer value = stringIntegerMap.get(key);
                value++;
                stringIntegerMap.replace(key, value);
                return;
            }
        }
        stringIntegerMap.put(wordToAdd, 1);

//        for (String key : stringIntegerMap.keySet()) {
//            if (stringIntegerMap.get(key).equals(wordToAdd)) {
//                Integer value = stringIntegerMap.get(key);
//                value ++ ;
//                stringIntegerMap.replace(key, value);
//                return;
//            }
//        }
//        stringIntegerMap.put(wordToAdd, 1);
    }

    public int getWordCount (String word){
        Set<String> keySet = stringIntegerMap.keySet();
        for (String key : keySet) {
            if (word.equals(key)) {
                return stringIntegerMap.get(key);
            }
        }
        return 0;
    }
}
