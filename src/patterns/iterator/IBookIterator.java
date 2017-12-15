package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IBookIterator implements Iterator {
    private ArrayList<Page> pageArrayList;
    private int currentIdx = 0;

    public IBookIterator(ArrayList<Page> bookArrayList) {
        this.pageArrayList = bookArrayList;
    }

    public boolean hasNext() {
        return currentIdx < this.pageArrayList.size();
    }

    @Override
    public Page next() {
        return (Page)this.pageArrayList.get(this.currentIdx++);
    }

}
