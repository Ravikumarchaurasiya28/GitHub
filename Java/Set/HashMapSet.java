import java.util.*;

public class HashMapSet {
    public static void main(String[] args) {
        //Map mp = new HashMap(); // for random data
        //Map mp = new TreeMap(); // For Sorted data
        Map mp = new LinkedHashMap(); // For view similar as putted
        //mp.put(key, value);
        mp.put("Name", "Ravi");
        mp.put("Roll No.", 28);
        mp.put("College", "GGITS");
        System.out.println(mp);
        //System.out.println(mp.get("Name"));
        System.out.println(mp.containsKey("Name"));
        System.out.println(mp.containsKey(28));
        System.out.println(mp.containsValue(28));
        System.out.println(mp.containsValue("College"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        //mp.clear();
        System.out.println(mp.isEmpty());
    }
}