
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        hashmap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getName().contains(text)).forEach(entry -> System.out.println(entry.getValue()));
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        hashmap.forEach((key, value) -> System.out.println(value.toString()));
    }


}
