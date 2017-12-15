package patterns.adapter;

import java.util.HashMap;

// 家用电源输出220V
public class HouseholdPower implements Power {
    public HashMap<String, Double> output(Double power) {
        HashMap<String, Double> res = new HashMap<>();
        res.put("voltage", new Double(220));
        res.put("power", power);
        return res;
    }
}
