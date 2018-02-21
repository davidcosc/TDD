package MyFirstTDD;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by david on 21.02.2018.
 */
public class ElementSetTest {
    ElementSet elements;
    @Before
    public void setUpElementSet() throws Exception {
        elements = new ElementSet();
    }

    @Test
    public void testIsEmptyOnEmptySet() throws Exception {
        assert elements.isEmpty() == true;
    }

    @Test
    public void testIsEmptyOnFilledSet() throws Exception {
        elements.add(1);
        assert elements.isEmpty() == false;
    }

    @Test
    public void testGetSizeOnEmptySet() throws Exception {
        assert elements.getSize() == 0;
    }

    @Test
    public void testGetSizeOnFilledSet() throws Exception {
        elements.add("2");
        assert elements.getSize() == 1;
    }

    @Test
    public void testContainsOnEmptySet() throws Exception {
        assert elements.contains(1) == false;
    }
}
