package com.java.practicums.practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {

    private Auto autoNull;
    private Auto autoLeeg;
    private Auto  autoMetPar;
    private Auto autoNegatief;
    private Klant klantNull;
    private Klant klantLeeg;
    private Klant klantMetPar;
    private AutoHuur aH;



    @BeforeEach
    public void autoIni(){
        autoNegatief = new Auto("", -50);
    }

    @BeforeEach
    public void autoHuurIni() {
        aH = new AutoHuur();
    }


    @BeforeEach
    public void huurObjectIni(){
        autoNull =  new Auto(null, 50);
        klantNull = new Klant(null);
    }


    @BeforeEach
    public void huurObjectIni2(){
        autoLeeg =  new Auto("", 50);
        klantLeeg = new Klant("");
    }


    @BeforeEach
    public void huurObjectIni3(){
        autoMetPar=  new Auto("BMW series 5", 50);
        klantMetPar = new Klant("Henk de Jonge ");
    }

    @Test
    void testAutoNullKlantNullKortingNull(){
        aH.setHuurder(klantNull);
        aH.setGehuurdeAuto(autoNull);
        assertEquals("Geen auto bekend\n" +
                        "Geen huurder bekend\n" +
                        "aantal dagen: 0 dat kost 0.0"
                ,aH.toString());
    }

    @Test
    void testAutoLeegKlantLeegKortingNull(){
        aH.setHuurder(klantLeeg);
        aH.setGehuurdeAuto(autoLeeg);
        assertEquals("Auto Type  met de prijs per dag 50.0\n" +
                        "Op naam van: (korting: 0.0%)\n" +
                        "aantal dagen: 0 dat kost 0.0"
                , aH.toString());
    }

    @Test
    void testAutoMetParKlantNullKortingNull(){
        aH.setHuurder(klantNull);
        aH.setGehuurdeAuto(autoMetPar);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Geen huurder bekend\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoMetParKlantLeegKortingNull(){
        aH.setHuurder(klantLeeg);
        aH.setGehuurdeAuto(autoMetPar);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Op naam van: (korting: 0.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoMetParKlantmetParKortingNull(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoMetPar);
        aH.setAantalDagen(4);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Op naam van: Henk de Jonge (korting: 0.0%)\n" +
                "aantal dagen: 4 dat kost 200.0", aH.toString());
    }

    @Test
    void testAutoMetParKlantMetParKortingMetPar(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoMetPar);
        klantMetPar.setKorting(10.0);
        aH.setAantalDagen(4);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Op naam van: Henk de Jonge (korting: 10.0%)\n" +
                "aantal dagen: 4 dat kost 180.0",aH.toString());
    }

    @Test
    void testAutoNullKlantmetParKortingMetPar(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoNull);
        klantMetPar.setKorting(10.0);
        assertEquals("Geen auto bekend\n" +
                "Op naam van: Henk de Jonge (korting: 10.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoLeegKlantMetParKortingMetPar(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoLeeg);
        klantMetPar.setKorting(10.0);
        assertEquals("Auto Type  met de prijs per dag 50.0\n" +
                "Op naam van: Henk de Jonge (korting: 10.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoNullKlantMetParKortingNull(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoLeeg);
        assertEquals("Auto Type  met de prijs per dag 50.0\n" +
                "Op naam van: Henk de Jonge (korting: 0.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoLeegKlantMetParKortingNull(){
        aH.setHuurder(klantMetPar);
        aH.setGehuurdeAuto(autoLeeg);
        assertEquals("Auto Type  met de prijs per dag 50.0\n" +
                "Op naam van: Henk de Jonge (korting: 0.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoNullKlantNullKortingMetPar(){
        aH.setHuurder(klantNull);
        aH.setGehuurdeAuto(autoNull);
        klantNull.setKorting(10.0);
        assertEquals("Geen auto bekend\n" +
                "Geen huurder bekend\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoleegKlantLeegKortingmetPar(){
        aH.setHuurder(klantLeeg);
        aH.setGehuurdeAuto(autoLeeg);
        klantLeeg.setKorting(10.0);
        assertEquals("Auto Type  met de prijs per dag 50.0\n" +
                "Op naam van: (korting: 10.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoMetParKlantNullKortingMetPar(){
        aH.setHuurder(klantNull);
        aH.setGehuurdeAuto(autoMetPar);
        klantNull.setKorting(10.0);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Geen huurder bekend\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    void testAutoMetParKlantLeegKortingmetPar(){
        aH.setHuurder(klantLeeg);
        aH.setGehuurdeAuto(autoMetPar);
        klantLeeg.setKorting(10.0);
        assertEquals("Auto Type BMW series 5 met de prijs per dag 50.0\n" +
                "Op naam van: (korting: 10.0%)\n" +
                "aantal dagen: 0 dat kost 0.0", aH.toString());
    }

    @Test
    public void testAutoPrijsIsNegatief() {
        assertEquals(50, autoNegatief.getPrijsPerDag());
    }

}