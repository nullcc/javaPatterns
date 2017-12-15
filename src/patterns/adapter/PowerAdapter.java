package patterns.adapter;

import java.util.HashMap;

// 笔记本电脑电源适配器，接受输入220V，功率60W，输出20V/60W
public class PowerAdapter extends ElectricAppliance implements Power {
    public PowerAdapter(Double ratedVoltage, Double ratedPower) {
        super(ratedVoltage, ratedPower);
    }

    public HashMap<String, Double> output(Double power) {
        HashMap<String, Double> res = new HashMap<>();
        res.put("voltage", new Double(20));
        res.put("power", power);
        return res;
    }
}
