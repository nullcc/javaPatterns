package patterns.factoryMethod;

public class GameConsoleFactory {
    public static IGameConsole getGameConsole(String name) {
        if (name.equalsIgnoreCase("playstation")) {
            return new PlayStation();
        } else if (name.equalsIgnoreCase("xbox")) {
            return new XBox();
        } else {
            return null;
        }
    }
}
