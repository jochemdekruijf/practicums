package com.java.practicums.practicum8;

import java.time.LocalDate;
import java.util.Objects;

public class Fiets extends Voertuig{
    private int framenummer;


    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }

    @Override
    public double huidigeWaarde() {
        double prijs = nieuwprijs;
        int verschil = LocalDate.now().getYear() - bouwjaar;
        return prijs * Math.pow(0.90, verschil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiets fiets = (Fiets) o;
        return framenummer == fiets.framenummer;
    }
}
