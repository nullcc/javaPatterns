package patterns.builder;

public class RobotA extends Robot {
    @Override
    protected void speak() {
        System.out.println("RobotA speak...");
    }

    @Override
    protected void walk() {
        System.out.println("RobotA walk...");
    }

    @Override
    protected void think() {
        System.out.println("RobotA think...");
    }
}
