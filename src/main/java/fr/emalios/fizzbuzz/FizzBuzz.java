package fr.emalios.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzz {

    private final Predicate<Integer> isFizz = integer -> (integer % 3 == 0 || integer.toString().contains("3"));
    private final Predicate<Integer> isBuzz = integer -> (integer % 5 == 0 || integer.toString().contains("5"));

    public String fizzBuzz(int number) {
        String result = "";
        if(this.isFizz.test(number)) {
            result += "Fizz";
        }
        if(this.isBuzz.test(number)) {
            result += "Buzz";
        }
        
        if (!result.isEmpty()) {
            return result;
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
