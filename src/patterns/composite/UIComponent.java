package patterns.composite;

import java.util.ArrayList;

public abstract class UIComponent {
    private String name;

    public UIComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void addChild(UIComponent component);
    public abstract void removeChild(UIComponent component);
    public abstract ArrayList<UIComponent> getChildren();
}
