package MyFirstTDD;

/**
 * Created by david on 22.02.2018.
 */
public class RemasteredSet {
    private int sizeCounter = 0;
    public boolean isEmpty() {
        return (sizeCounter == 0);
    }

    public void add(Object element) {
        sizeCounter++;
    }
}
