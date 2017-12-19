package patterns.state;

public class GasState extends WaterState {
    @Override
    public void liquefy() {
        this.context.setCurrentState(Context.liquidState);
        this.context.getCurrentState().liquefy();
    }

    @Override
    public void evaporate() {
        System.out.println("水->水蒸气：气化过程");
    }

    @Override
    public void freeze() {
        // do nothing
    }

    @Override
    public void melt() {
        // do nothind
    }

    @Override
    public void desublimate() {
        this.context.setCurrentState(Context.solidState);
        this.context.getCurrentState().desublimate();
    }

    @Override
    public void sublimate() {
        System.out.println("冰->水蒸气：升华过程");
    }
}
