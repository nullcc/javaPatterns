package patterns.factoryMethod;

public class Test {
    public static void main(String[] args) {
        IGameConsole playstation = GameConsoleFactory.getGameConsole("playstation");
        playstation.play();
        IGameConsole xbox = GameConsoleFactory.getGameConsole("xbox");
        xbox.play();
    }
}
