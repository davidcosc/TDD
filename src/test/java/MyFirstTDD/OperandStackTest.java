package MyFirstTDD;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 21.02.2018.
 */
public class OperandStackTest {
    @Test
    public void testNewStackPeekIsZero() throws Exception {
        OperandStack values = new OperandStack();
        assertEquals(BigDecimal.ZERO, values.getPeek());
    }

    @Test
    public void testPushValueOntoStack() throws Exception {
        OperandStack values = new OperandStack();
        BigDecimal value = new BigDecimal(15);
        values.push(value);
        assertEquals(value, values.getPeek());
    }
}
