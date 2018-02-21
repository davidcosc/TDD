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
        BigDecimal value01 = new BigDecimal(15);
        BigDecimal value02 = new BigDecimal(16);
        values.push(value01);
        values.replacePeek(value02);
        assertEquals(value02, values.getPeek());
    }

    @Test
    public void testReplacingPeekValueOfStackUsingEmptyStack() throws Exception {
        BigDecimal value = new BigDecimal(15);
        values.replacePeek(value);
        assertEquals(value, values.getPeek());
    }
}
