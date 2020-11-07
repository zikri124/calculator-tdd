import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
 Calculator calculator = new Calculator();

 @Test
 public void givenNumberShouldReturnTheSumOfTheNumAndResult() {
  assertEquals("5.0", String.valueOf(calculator.add(2, 3)));
 }

 @Test
 public void givenNumberShouldReturnSubtractOfResultAndNum() {
  assertEquals("-1.0", String.valueOf(calculator.subtract(2, 3)));
 }
}
