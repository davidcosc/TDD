package MyFirstTDD;

/**
 * Created by david on 21.02.2018.
 */
public class ElementSet {
    Object[] elements = new Object[2];
    int size = 0;

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public void add(Object element) {
        elements[0] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Object element) {
        if(getSize() == 0) {
            return false;
        }

        if(elements[0].equals(element)) {
            return true;
        }
        return false;
    }
}
