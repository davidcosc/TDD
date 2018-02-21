package MyFirstTDD;

/**
 * Created by david on 21.02.2018.
 */
public class ElementSet {
    int size = 0;

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public void add(Object element) {
        size++;
    }

    public int getSize() {
        return size;
    }
}
