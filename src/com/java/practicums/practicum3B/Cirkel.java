package com.java.practicums.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositive;
    private int yPositive;

    public Cirkel(int rad, int x, int y){
        this.xPositive = x;
        this.yPositive = y;

        if( rad > 0) {
            this.radius = rad;
        }else {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString() {
        return "Cirkel(" + this.xPositive + ", " +this.yPositive + ")" + " met radius:" + this.radius;
    }
}
