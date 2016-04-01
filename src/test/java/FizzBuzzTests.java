import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTests {
    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_fizz_when_input_divisible_by_3() {
        Assert.assertEquals("fizz", fizzBuzz.translate(3));
    }

    @Test
    public void should_return_buzz_when_input_divisible_by_5() {
        Assert.assertEquals("buzz", fizzBuzz.translate(5));
    }

    @Test
    public void should_return_fizzbuzz_when_input_divisible_by_3_and_5() {
        Assert.assertEquals("fizzbuzz", fizzBuzz.translate(15));
    }

    @Test
    public void should_return_itself_when_input_neither_divisible_by_3_nor_by_5() {
        Assert.assertEquals("1", fizzBuzz.translate(1));
    }
}
