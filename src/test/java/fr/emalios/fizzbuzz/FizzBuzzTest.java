package fr.emalios.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void test_return_number() {
        assert this.fizzBuzz.fizzBuzz(1).equals("1");
    }

    @Test
    public void test_fizz() {
        assert this.fizzBuzz.fizzBuzz(3).equals("Fizz");
        assert this.fizzBuzz.fizzBuzz(31).equals("Fizz");
    }

    @Test
    public void test_buzz() {
        assert this.fizzBuzz.fizzBuzz(5).equals("Buzz");
        assert this.fizzBuzz.fizzBuzz(52).equals("Buzz");
    }

    @Test
    public void test_fizz_buzz() {
        assert this.fizzBuzz.fizzBuzz(15).equals("FizzBuzz");
    }

}
