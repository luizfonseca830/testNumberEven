package org.example;

import java.util.ArrayList;
import java.util.List;

public class LoopEvenNumber implements Numbers {
    @Override
    public List<Integer> evenNumbers(List<Integer> numbers) {
        List<Integer> loopEvenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                loopEvenNumbers.add(number);
            }
        }
        return loopEvenNumbers;
    }
}
