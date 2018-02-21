package MyFirstTDD;

import org.junit.Test;

/**
 * Created by david on 21.02.2018.
 */
public class ElementSetTest {
    @Test
    public void testIsEmptyOnEmptySet() throws Exception {
        ElementSet elements = new ElementSet();
        assert elements.isEmpty() == true;
    }
}
