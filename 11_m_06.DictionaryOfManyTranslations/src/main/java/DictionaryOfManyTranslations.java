import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (dictionary.containsKey(word)) {
            dictionary.get(word).add(translation);
        } else {
            dictionary.put(word, new ArrayList<String>(Collections.singletonList(translation)));
        }
    }

    public ArrayList<String> translate(String word) {
        if (dictionary.get(word) != null) {
            return dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

}
