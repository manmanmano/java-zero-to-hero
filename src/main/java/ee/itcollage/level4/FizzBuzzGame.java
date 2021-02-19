package ee.itcollage.level4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGame {

    //todo fizzbuzz is a drinking game
    // hope your version will be as fun
    // rules are as follows:
    // numbers 1-100
    // if it divides by 3 you see fizz
    // if it divides by 5 you see buzz
    // if it divides by 3 and 5 at the same time you say fizzbuzz
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        for (Integer number : numbers) {
            //do your logic
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
            } else if (number % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
