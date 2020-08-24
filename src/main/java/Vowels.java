/**
 * The task of this unit is: (task from https://www.codewars.com/kata/54ff3102c1bad923760001f3/javamvn )
 *
 * Return the number (count) of vowels in the given string. *
 * We will consider a, e, i, o, u as vowels for this task (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */

import java.util.stream.IntStream;

public class Vowels {
    public static int countVowels(String str) {
        IntStream streamFromString = str.chars();
        return (int) streamFromString.filter(
                    x -> x == 'a'
                        || x == 'e'
                        || x == 'i'
                        || x == 'o'
                        || x == 'u')
                .count();
    }
}

