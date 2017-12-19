package patterns.state;

public abstract class WaterState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 液化
    public abstract void liquefy();

    // 汽化
    public abstract void evaporate();

    // 凝固
    public abstract void freeze();

    // 熔化
    public abstract void melt();

    // 凝华
    public abstract void desublimate();

    // 升华
    public abstract void sublimate();
}
