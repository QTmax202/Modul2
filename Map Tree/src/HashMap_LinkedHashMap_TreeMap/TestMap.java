package HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new TreeMap<>();

        hashMap.put("S",24);
        hashMap.put("O",7);
        hashMap.put("U",20);
        hashMap.put("T",37);
        hashMap.put("Q",73);
        hashMap.put("W",90);

        System.out.println(hashMap);

        Map<String, Integer> treeMap = new HashMap<>(hashMap);
        System.out.println("----");
        System.out.println(treeMap);

        Map<String, Integer> linked = new LinkedHashMap<>(16, 0.75f, true);
        linked.put("S",24);
        linked.put("O",7);
        linked.put("U",20);
        linked.put("T",37);
        linked.put("Q",73);
        linked.put("W",90);
        System.out.println("----");
        System.out.println(linked.get("O"));
    }
}
