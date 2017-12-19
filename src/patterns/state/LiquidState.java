package patterns.state;

public class LiquidState extends WaterState {
    @Override
    public void liquefy() {
        System.out.println("水蒸气->水：液化过程");
    }

    @Override
    public void evaporate() {
        this.context.setCurrentState(Context.gasState);
        this.context.getCurrentState().evaporate();
    }

    @Override
    public void freeze() {
        this.context.setCurrentState(Context.solidState);
        this.context.getCurrentState().freeze();
    }

    @Override
    public void melt() {
        System.out.println("冰->水：熔化过程");
    }

    @Override
    public void desublimate() {
        // do nothing
    }

    @Override
    public void sublimate() {
        // do nothing
    }
}
