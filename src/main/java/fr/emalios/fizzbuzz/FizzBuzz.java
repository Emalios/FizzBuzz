package fr.emalios.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzz {

    private final Predicate<Integer> isFizz = integer -> (integer % 3 == 0 || integer.toString().contains("3"));
    private final Predicate<Integer> isBuzz = integer -> (integer % 5 == 0 || integer.toString().contains("5"));
    private final Predicate<Integer> isFizzBuzz = integer -> (this.isFizz.test(integer) && this.isBuzz.test(integer));

    public String fizzBuzz(int number) {
        if(this.isFizzBuzz.test(number)) {
            return "FizzBuzz";
        }
        if(this.isFizz.test(number)) {
            return "Fizz";
        }
        if(this.isBuzz.test(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }
    }

}
