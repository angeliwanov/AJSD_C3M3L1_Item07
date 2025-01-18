import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void multiplyShouldReturnProductOfTwoNumbers() {
        Calculator calculator = new Calculator();
        double product = calculator.multiply(2, 3);
        assertEquals(6, product);
    }
}
