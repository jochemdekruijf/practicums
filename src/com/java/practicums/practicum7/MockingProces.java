package com.java.practicums.practicum7;

import java.util.Random;

public class MockingProces implements OpmaakProces {

    public MockingProces() {
    }

    @Override
    public String maakOp(String input) {
        StringBuilder output = new StringBuilder();

        for (char a : input.toCharArray()) {
            Random r = new Random();
            if (r.nextBoolean()) {
                a = Character.toUpperCase(a);
            } else {
                a = Character.toLowerCase(a);
            }
            output.append(a);
        }
        return output.toString();
    }
}
