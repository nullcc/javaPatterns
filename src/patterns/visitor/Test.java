package patterns.visitor;

import java.util.ArrayList;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        InfoVisitor infoVisitor = new InfoVisitor();
        BonusVisitor bonusVisitor = new BonusVisitor();
        for (Staff staff:getStaffs()) {
            staff.accept(infoVisitor);
            staff.accept(bonusVisitor);
        }

        infoVisitor.showStaffInfo();
        bonusVisitor.showTotalBonus();
    }

    private static ArrayList<Staff> getStaffs() {
        ArrayList<Staff> staffs = new  ArrayList<Staff>();

        Empolyee empolyee1 = new Empolyee("Jack", 30, 8000);
        Empolyee empolyee2 = new Empolyee("Bob", 23, 4000);
        Empolyee empolyee3 = new Empolyee("Jane", 33, 9000);
        Manager manager1 = new Manager("John", 50, 20000);

        empolyee1.setJob("Sale");
        empolyee2.setJob("Engineer");
        empolyee3.setJob("Accounting");
        manager1.setPerformance(100000);

        staffs.add(empolyee1);
        staffs.add(empolyee2);
        staffs.add(empolyee3);
        staffs.add(manager1);

        return staffs;
    }
}
