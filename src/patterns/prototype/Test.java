package patterns.prototype;

public class Test {
    public static void main(String[] args) {
        int count = 10;
        Minion minion = new Minion(0);
        for (int i = 0; i < count; i++) {
            Minion cloneMinion = minion.clone();
            cloneMinion.setId(i);
            System.out.print("Minion " + cloneMinion.getId() + " is singing: ");
            cloneMinion.sing();
        }
    }
}
