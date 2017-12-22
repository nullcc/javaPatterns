package patterns.composite;

import java.util.ArrayList;

public class Container extends UIComponent {
    private ArrayList<UIComponent> children = new ArrayList<UIComponent>();

    public Container(String name) {
        super(name);
    }

    @Override
    public void addChild(UIComponent component) {
        this.children.add(component);
    }

    @Override
    public void removeChild(UIComponent component) {
        this.children.remove(component);
    }

    @Override
    public ArrayList<UIComponent> getChildren() {
        return this.children;
    }
}
