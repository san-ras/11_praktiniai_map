import java.util.HashMap;
import java.util.Map;

public class IOU {

    private HashMap<String, Double> debts;

    public IOU() {
        debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debts.entrySet().stream()
                .filter(entry -> entry.getKey().equals(toWhom))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(0.0);
    }
}
