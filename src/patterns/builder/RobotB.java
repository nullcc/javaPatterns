package patterns.builder;

public class RobotB extends Robot {
    @Override
    protected void speak() {
        System.out.println("RobotB speak...");
    }

    @Override
    protected void walk() {
        System.out.println("RobotB walk...");
    }

    @Override
    protected void think() {
        System.out.println("RobotB think...");
    }
}