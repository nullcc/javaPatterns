package patterns.composite;

import java.util.ArrayList;

public class Component extends UIComponent {
    public Component(String name) {
        super(name);
    }

    @Deprecated
    public void addChild(UIComponent component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void removeChild(UIComponent component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ArrayList<UIComponent> getChildren() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
