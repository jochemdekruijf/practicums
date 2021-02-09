package com.java.practicums.practicum2A;

public class Zwembad {
    private double lengte;
    private double diepte;
    private double breedte;

    public Zwembad (double lengte, double diepte, double breedte) {
        this.lengte = lengte;
        this.diepte = diepte;
        this.breedte = breedte;
    }

    public Zwembad () {

    }

    public double inhoud() {
       return lengte * breedte * diepte;
    }

    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte +
                " meter lang, en " + diepte + " meter diep";
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }
}
