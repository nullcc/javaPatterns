package patterns.iterator;

import java.util.ArrayList;

public class Book {
    private ArrayList<Page> pageArrayList = new ArrayList<Page>();

    public void add(Page page) {
        this.pageArrayList.add(page);
    }

    public void remove(Page page) {
        this.pageArrayList.remove(page);
    }

    public IBookIterator iterator() {
        return new IBookIterator(this.pageArrayList);
    }
}
