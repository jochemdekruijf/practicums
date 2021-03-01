package com.java.practicums.practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm) {
        this.naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return naam+ "heeft cijfer:" + cijfer;
    }
}
