package patterns.command;

public class Test {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

//        Command command1 = new FunACommand();
        Command command2 = new FunBCommand();
        projectManager.setCommand(command2);
        projectManager.action();
    }
}
