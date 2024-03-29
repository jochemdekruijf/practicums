package com.java.practicums.practicum8;

import java.util.Objects;

import static com.java.practicums.practicum8.Utils.euroBedrag;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;


    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 && bouwjaar == voertuig.bouwjaar && Objects.equals(type, voertuig.type);
    }

    @Override
    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + euroBedrag(nieuwprijs);
    }
}
