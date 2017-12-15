package patterns.adapter;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Power householdPower = new HouseholdPower();
        ElectricAppliance laptop = new Laptop(new Double(20), new Double(60));
        PowerAdapter powerAdapter = new PowerAdapter(new Double(220), new Double(60));

        System.out.println("----- Not used power adapter. -----");
        // 家用电源直接对笔记本电脑供电，电脑无法工作
        HashMap<String, Double> householdPowerOutput = householdPower.output(new Double(60));
        laptop.input(householdPowerOutput.get("voltage"), householdPowerOutput.get("power"));

        System.out.println();

        System.out.println("----- Used power adapter. -----");
        // 通过电源适配器给电脑供电，电脑正常工作
        powerAdapter.input(householdPowerOutput.get("voltage"), householdPowerOutput.get("power"));
        HashMap<String, Double> powerAdapterOutput = powerAdapter.output(new Double(60));
        laptop.input(powerAdapterOutput.get("voltage"), powerAdapterOutput.get("power"));
    }
}
