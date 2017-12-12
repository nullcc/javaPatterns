package patterns.factoryMethod;

public class PlayStation implements IGameConsole {
    @Override
    public void play(){
        System.out.println("PlayStation play!");
    }
}
