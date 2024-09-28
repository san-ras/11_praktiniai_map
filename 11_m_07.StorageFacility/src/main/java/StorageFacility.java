import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (storageUnits.containsKey(unit)) {
            storageUnits.get(unit).add(item);
        } else {
            storageUnits.put(unit, new ArrayList<String>(Collections.singletonList(item)));
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storageUnits.get(storageUnit) != null) {
            return storageUnits.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (storageUnits.get(storageUnit).size() <= 1) {
            storageUnits.remove(storageUnit);
        } else {
            storageUnits.get(storageUnit).remove(String.valueOf(item));
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(storageUnits.keySet());
    }
}
