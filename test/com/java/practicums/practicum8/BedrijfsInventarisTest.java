package com.java.practicums.practicum8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class BedrijfsInventarisTest {

    @Test
    public void onvoldoendebudget() {
        BedrijfsInventaris bedrijf = new BedrijfsInventaris("testbedrijf", 10);
        Fiets fiets = new Fiets("fiets", 100, 2020, 235);
        bedrijf.schafAan(fiets);
        assertEquals("", bedrijf.toString());
    }

    @Test
    public void dezelfdegoed() {
        BedrijfsInventaris bedrijf = new BedrijfsInventaris("test", 100000);
        Fiets fiets1 = new Fiets("fiets", 150, 2020, 235);
        Fiets fiets2 = new Fiets("fiets", 150, 2020, 235);
        bedrijf.schafAan(fiets1);
        bedrijf.schafAan(fiets2);
        assertEquals("voertuig: fiets met bouwjaar 2020 heeft een waarde van: €135.00\n", bedrijf.toString());
    }

    @Test
    public void huidigeWaardeCheck() {
        Fiets fiets = new Fiets("fiets", 150, 2020, 235);
        int verschil = LocalDate.now().getYear() - 2020;
        double prijs = 150 * Math.pow(0.90, verschil);
        assertEquals(prijs,fiets.huidigeWaarde());
    }

}