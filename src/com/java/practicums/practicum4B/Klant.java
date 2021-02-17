package com.java.practicums.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;

    }

    public Klant() {

    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    @Override
    public String toString() {
        if (this.naam == null) return "Geen huurder bekend";
        return "Op naam van: " + this.naam + "(korting: " + this.kortingsPercentage + "%)";
    }


}

