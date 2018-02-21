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
        elements.add();
        assert elements.isEmpty() == false;
    }
}
