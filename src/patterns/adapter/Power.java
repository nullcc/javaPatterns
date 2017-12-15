package patterns.adapter;

import java.util.HashMap;

// 电源抽象类
public interface Power {
    public HashMap<String, Double> output(Double power);
}
