package com.java.practicums.practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {

    @Test
    public void huurderIsNull() {
        Klant k1 = new Klant();
        assertEquals("Geen huurder bekend", k1.toString());
    }

    @Test
    public void autoIsNull() {
        Auto k1 = new Auto();
        assertEquals("Geen auto bekend", k1.toString());
    }

    @Test
    public void prijsIsNegatief() {
        Auto auto = new Auto("", -50);
        assertEquals(50, auto.getPrijsPerDag());
    }


}