package patterns.adapter;

import java.util.ArrayList;

// 用电器抽象类
public abstract class ElectricAppliance {
    private Double ratedVoltage;
    private Double ratedPower;

    public ElectricAppliance(Double ratedVoltage, Double ratedPower) {
        this.ratedVoltage = ratedVoltage;
        this.ratedPower = ratedPower;
    }

    public Double getRatedPower() {
        return ratedPower;
    }

    public Double getRatedVoltage() {
        return ratedVoltage;
    }

    public void input(Double voltage, Double power) {
        System.out.println(this.getClass().getName() + " get voltage " + voltage + "V power " + power + "W.");

        if (voltage.equals(this.getRatedVoltage()) && power.equals(this.getRatedPower())) {
            System.out.println(this.getClass().getName() + " work!");
        } else {
            System.out.println(this.getClass().getName() + " can't work!");
        }
    }
}
