package MyFirstTDD;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by david on 22.02.2018.
 */
public class RemasteredSetTest {
    RemasteredSet elements;

    @Before
    public void setUpEmptyElements() throws Exception {
        elements = new RemasteredSet();
    }

    @Test
    public void testIsEmptyOnEmptySet() throws Exception {
        assert elements.isEmpty() == true;
    }

    @Test
    public void testIsEmptyOnSetWithOneElement() throws Exception {
        elements.add(1);
        assert elements.isEmpty() == false;
    }

    @Test
    public void testIsEmptyOnSetWithTwoElements() throws Exception {
        elements.add(1);
        elements.add("2");
        assert elements.isEmpty() == false;
    }
}
