package com.java.practicums.practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;

        if( prijsPerDag < 0) {
           this.prijsPerDag = Math.abs(prijsPerDag);
        } else {
            this.prijsPerDag = prijsPerDag;
        }
    }

    public Auto() {

    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }


    @Override
    public String toString() {
        if (this.type == null) return "Geen auto bekend";
        return "Auto Type " + this.type + " met de prijs per dag " + this.prijsPerDag;
    }
}
