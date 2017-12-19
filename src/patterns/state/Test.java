package patterns.state;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new LiquidState());

        context.evaporate();    // 水->水蒸气：汽化过程
        context.desublimate();  // 水蒸气->冰：凝华过程
        context.melt();         // 冰->水：熔化过程
        context.freeze();       // 水->冰：凝固过程
        context.sublimate();    // 冰->水蒸气：升华过程
        context.liquefy();      // 水蒸气->水：液化过程
    }
}
