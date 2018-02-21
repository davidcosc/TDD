package MyFirstTDD;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by david on 20.02.2018.
 */
public class Calculator {
    private Stack<BigDecimal> values = new Stack<BigDecimal>();

    public BigDecimal getAccumulator() {
        if(values.size() == 0) {
            return BigDecimal.ZERO;
        }
        return values.peek();
    }

    public void setAccumulator(BigDecimal accumulator) {
        if(values.size() == 0) {
            values.push(accumulator);
            return;
        }
        values.pop();
        values.push(accumulator);
        return;
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }
}
