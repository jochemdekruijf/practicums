package com.java.practicums.practicum4A;

public class Persoon {
    private  String naam;
    private  int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public Persoon() {

    }

    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd;
    }
}
