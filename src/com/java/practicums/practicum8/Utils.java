package com.java.practicums.practicum8;

public class Utils {

    private static int counter;

    public static void main(String[] args) {
        com.java.practicums.practicum9A.Utils.euroBedrag(3.11314);
        com.java.practicums.practicum9A.Utils.euroBedrag(3.11314, 1);
    }

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        counter++;
        return "€" + String.format("%." + precisie + "f", bedrag);
    }
}
