package org.example.utils;

import java.util.stream.IntStream;

public class Primo {

    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .allMatch(n -> num % n != 0);
    }
}
