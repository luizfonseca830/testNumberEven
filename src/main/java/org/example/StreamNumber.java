package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamNumber implements Numbers{
    @Override
    public List<Integer> evenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}
