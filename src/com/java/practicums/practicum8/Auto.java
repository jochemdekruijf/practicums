package com.java.practicums.practicum8;

import java.util.Objects;

public class Auto extends Voertuig{
    private String kenteken;


    public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(kenteken, auto.kenteken);
    }
}
