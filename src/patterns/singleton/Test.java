package patterns.singleton;

public class Test {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
