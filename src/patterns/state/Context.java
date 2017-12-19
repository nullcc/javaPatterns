package patterns.state;

public class Context {
    private WaterState currentState;
    public final static WaterState liquidState = new LiquidState();
    public final static WaterState solidState = new SolidState();
    public final static WaterState gasState = new GasState();

    public void setCurrentState(WaterState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public WaterState getCurrentState() {
        return this.currentState;
    }

    public void liquefy() {
        this.currentState.liquefy();
    }

    public void evaporate() {
        this.currentState.evaporate();
    }

    public void freeze() {
        this.currentState.freeze();
    }

    public void melt() {
        this.currentState.melt();
    }

    public void desublimate() {
        this.currentState.desublimate();
    }

    public void sublimate() {
        this.currentState.sublimate();
    }
}
