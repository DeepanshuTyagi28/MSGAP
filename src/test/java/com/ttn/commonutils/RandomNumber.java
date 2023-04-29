package com.ttn.commonutils;

import java.util.Random;

public class RandomNumber {
    private static Random random;
    private static final String INT_CHAR = "0123456789";

    public static String getRandomNumber(int size) {
        random = new Random();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++)
            sb.append(INT_CHAR.charAt(random.nextInt(INT_CHAR.length())));
        return sb.toString();
    }
}
