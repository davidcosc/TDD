package MyFirstTDD;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 21.02.2018.
 */
public class OperandStackTest {
    OperandStack values;

    @Before
    public void setUpNewOperandStack() throws Exception {
        values = new OperandStack();
    }

    @Test
    public void testNewStackPeekIsZero() throws Exception {
        assertEquals(BigDecimal.ZERO, values.getPeek());
    }

    @Test
    public void testPushValueOntoStack() throws Exception {
        BigDecimal value = new BigDecimal(15);
        values.push(value);
        assertEquals(value, values.getPeek());
    }

    @Test
    public void testReplacePeekValueOfStack() throws Exception {

    }
}
