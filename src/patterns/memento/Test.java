package patterns.memento;

public class Test {
    public static void main(String[] args) {
        Player player = new Player(100);
        MementoManager mementoManager = new MementoManager(player.createMemento());
        System.out.println("玩家初始血量：" + player.getHp());
        player.setHp(60);
        System.out.println("玩家受到攻击，玩家当前血量：" + player.getHp());
        player.restoreMemento(mementoManager.getMemento());
        System.out.println("读取存档，玩家当前血量：" + player.getHp());
    }
}
