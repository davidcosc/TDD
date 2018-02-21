package MyFirstTDD;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by david on 21.02.2018.
 */
public class OperandStack {
    Stack<BigDecimal> values = new Stack<BigDecimal>();

    public BigDecimal getPeek() {
        if(values.size() == 0) {
            return BigDecimal.ZERO;
        }
        return values.peek();
    }

    public void push(BigDecimal value) {
        values.push(value);
    }
}
