package MyFirstTDD;

/**
 * Created by david on 22.02.2018.
 */
public class RemasteredSet {
    private Object[] elements = new Object[2];
    private int sizeCounter = 0;
    public boolean isEmpty() {
        return (size() == 0);
    }

    public void add(Object element) {
        elements[size()] = element;
        sizeCounter++;
    }

    public int size() {
        return sizeCounter;
    }

    public boolean contains(Object element) {
        if(size() == 0) {
            return false;
        }

        for(int i = 0; i < size(); i++) {
            if(elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
