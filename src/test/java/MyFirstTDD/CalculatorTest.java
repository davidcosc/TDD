package MyFirstTDD;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 20.02.2018.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUpNewCalculator() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAccumulatorOfZero() throws Exception {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulator() throws Exception {
        BigDecimal bigDecimal = new BigDecimal(23);
        calculator.setAccumulator(bigDecimal);
        assertEquals(bigDecimal, calculator.getAccumulator());
    }

    @Test
    public void testEnteringAndDroppingValues() throws Exception {
        BigDecimal value01 = new BigDecimal(15);
        BigDecimal value02 = new BigDecimal(16);
        BigDecimal value03 = new BigDecimal(17);
        calculator.setAccumulator(value01);
        calculator.enter();
        calculator.setAccumulator(value02);
        calculator.enter();
        calculator.setAccumulator(value03);
        assertEquals(value03, calculator.getAccumulator());
        calculator.drop();
        assertEquals(value02, calculator.getAccumulator());
        calculator.drop();
        assertEquals(value01, calculator.getAccumulator());
    }
}
