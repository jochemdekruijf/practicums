package com.java.practicums.practicum7;

public class HoofdletterProces implements OpmaakProces{

    public HoofdletterProces() {

    }

    @Override
    public String maakOp(String input) {
        return input.toUpperCase();
    }
}
