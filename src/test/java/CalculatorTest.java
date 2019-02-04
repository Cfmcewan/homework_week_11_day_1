import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers(){
        assertEquals(7, calculator.addNumbers(3, 4));
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(10, calculator.subtractNumbers(20, 10));
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(6, calculator.multiplyNumbers(3, 2));
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(3, calculator.divideNumbers(9, 3));
    }
}
