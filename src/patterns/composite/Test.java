package patterns.composite;

public class Test {
    public static void main(String[] args) {
        UIComponent window = compositeUITree();
        String info = displayTree(window);
        System.out.println(info);
    }

    public static UIComponent compositeUITree() {
        UIComponent window = new Container("window");
        UIComponent panel1 = new Container("panel1");
        UIComponent listView = new Container("listView");

        window.addChild(panel1);
        window.addChild(listView);

        UIComponent imageView1 = new Component("imageView1");
        UIComponent textView1 = new Component("textView1");

        panel1.addChild(imageView1);
        panel1.addChild(textView1);

        UIComponent panel2 = new Container("panel2");
        UIComponent imageView2 = new Component("imageView2");
        UIComponent textView2 = new Component("textView2");
        panel2.addChild(imageView2);
        panel2.addChild(textView2);

        UIComponent panel3 = new Container("panel3");
        UIComponent imageView3 = new Component("imageView3");
        UIComponent textView3 = new Component("textView3");
        panel3.addChild(imageView3);
        panel3.addChild(textView3);

        listView.addChild(panel2);
        listView.addChild(panel3);

        return window;
    }

    public static String displayTree(UIComponent root) {
        String info = "";
        for (UIComponent c:root.getChildren()) {
            if (c instanceof Container) {
                info += c.getName() + "\n" + displayTree(c);
            } else {
                info += c.getName() + "\n";
            }
        }
        return info;
    }
}
