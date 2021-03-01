package com.java.practicums.practicum6A;

import java.time.LocalDate;
import java.util.Objects;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwPrijs;


    public Game(String naam, int releaseJaar, double nieuwPrijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwPrijs = nieuwPrijs;
    }

    public double huidigeWaarde() {
        double prijs = this.nieuwPrijs;
        int verschil = LocalDate.now().getYear() - releaseJaar;
        return prijs * Math.pow(0.70, verschil);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    public void setReleaseJaar(int releaseJaar) {
        this.releaseJaar = releaseJaar;
    }

    public double getNieuwPrijs() {
        return nieuwPrijs;
    }

    public void setNieuwPrijs(double nieuwPrijs) {
        this.nieuwPrijs = nieuwPrijs;
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwPrijs) +
                " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseJaar == game.releaseJaar && Objects.equals(naam, game.naam);
    }
}
