package patterns.state;

public class SolidState extends WaterState {
    @Override
    public void liquefy() {
        // do nothing
    }

    @Override
    public void evaporate() {
        // do nothing
    }

    @Override
    public void freeze() {
        System.out.println("水->冰：凝固过程");
    }

    @Override
    public void melt() {
        this.context.setCurrentState(Context.liquidState);
        this.context.getCurrentState().melt();
    }

    @Override
    public void desublimate() {
        System.out.println("水蒸气->冰：凝华过程");
    }

    @Override
    public void sublimate() {
        this.context.setCurrentState(Context.gasState);
        this.context.getCurrentState().sublimate();
    }
}
