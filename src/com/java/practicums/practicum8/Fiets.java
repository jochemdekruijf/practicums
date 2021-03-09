package com.java.practicums.practicum8;

import java.util.Objects;

public class Fiets extends Voertuig{
    private int framenummer;


    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
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
