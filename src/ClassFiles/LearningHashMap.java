package ClassFiles;

import java.util.HashMap;

public class LearningHashMap {
    private HashMap<Integer, String> basicHashMap;


    public LearningHashMap(HashMap<Integer, String> basicHashMap) {
        this.basicHashMap = basicHashMap;
    }

    public void AddToHashmap(Integer val, String string)
    {
        this.basicHashMap.put(val, string);
    }
}
