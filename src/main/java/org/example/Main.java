package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            numeros.add(i);
        }

        StreamNumber numberStream = new StreamNumber();
        List<Integer> evenNumbersStream = numberStream.evenNumbers(numeros);

        LoopEvenNumber loopEvenNumber = new LoopEvenNumber();
        List<Integer> evenNumberLoop = loopEvenNumber.evenNumbers(numeros);

        System.out.println("Stream Number " + evenNumbersStream);
        System.out.println("Loop Number " + evenNumberLoop);

    }

}