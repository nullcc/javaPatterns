package patterns.adapter;

// 笔记本电脑，接受输入20V/60W
public class Laptop extends ElectricAppliance {
    public Laptop(Double ratedVoltage, Double ratedPower) {
        super(ratedVoltage, ratedPower);
    }
}
