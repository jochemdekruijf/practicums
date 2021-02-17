package com.java.practicums.practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas = new Persoon();


    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public Huis() {

    }

    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }
    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return "Huis: " + this.adres + "is gebouwd in " + this.bouwjaar + "\n"
                + "en heeft huisbaas " +huisbaas;

    }
}
