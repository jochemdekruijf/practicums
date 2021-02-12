package com.java.practicums.practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijkspel;

    public Voetbalclub(String naam, int gewonnen, int verloren, int gelijkspel) {
        this.aantalGewonnen = gewonnen;
        this.aantalVerloren = verloren;
        this.aantalGelijkspel = gelijkspel;

        if (naam == null || naam.equals("")) {
            this.naam = "FC";
        }
        else {
            this.naam = naam;
        }
    }

    public Voetbalclub(String naaml) {
        if (naaml == null || naaml.equals("")) {
            this.naam = "FC";
        }
        else {
            this.naam = naaml;
        }
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijkspel + aantalVerloren;
    }

    public int aantalPunten() {
        int totaalPunten = 0;

        for (int i = 0; i < aantalGewonnen; i++) {
            totaalPunten = totaalPunten + 3;
        }

        for (int i = 0; i < aantalGelijkspel; i++) {
            totaalPunten = totaalPunten + 1;
        }

        return totaalPunten;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijkspel = aantalGelijkspel + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String toString() {
        return naam + " " + (aantalVerloren + aantalGewonnen + aantalGelijkspel) + " " +
                aantalGewonnen + " " + aantalGelijkspel + " " + aantalVerloren + " " + aantalPunten();
    }
}
