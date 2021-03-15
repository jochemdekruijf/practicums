package com.java.practicums.practicum9A;

public class Utils {
    private double bedrag;
    private int precisie;
    private static int counter;

    public static void main(String[] args) {
        Utils.euroBedrag(3.11314);
        Utils.euroBedrag(3.11314, 1);
    }

    public static String euroBedrag(double bedrag) {
        counter++;
        return "€" + String.format("%.2f", bedrag);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        counter++;
        return "€" + String.format("%."+ precisie +"f", bedrag);
    }
}
