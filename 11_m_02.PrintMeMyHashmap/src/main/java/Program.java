
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        printValuesOfKeysWhere(hm, "a");
        printKeys(hm);
        printKeysWhere(hm, "a");
        printValuesOfKeysWhere(hm, "a");
    }


    public static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains(text)).forEach(entry -> System.out.println(entry.getKey()));
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains(text)).forEach(entry -> System.out.println(entry.getValue()));
    }

}
