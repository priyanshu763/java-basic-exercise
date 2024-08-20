package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class hashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        // you can use treeMap as well instead of HashMap but TreeMap use to do it in a sorted order

        map.put("kunal", 90);
        map.put("rahul", 89);
        map.put("karan", 45);

        System.out.println(map.get("kunal"));
        System.out.println(map.getOrDefault("hari", 67));
        System.out.println(map.containsKey("rahul"));

        // HASHSET :  having no duplicate values

        HashSet<Integer> set = new HashSet<>();
        set.add(67);
        set.add(89);
        set.add(87);
        set.add(23);
        set.add(56);
        set.add(32);
        set.add(89);

        System.out.println(set);




    }
}
