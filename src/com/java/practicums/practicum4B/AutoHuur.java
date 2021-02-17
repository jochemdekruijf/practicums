package com.java.practicums.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder = new Klant();
    private Auto gehuurdeAuto = new Auto();

    public AutoHuur(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public AutoHuur() {

    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public double totaalPrijs() {
        return this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen / 100 * (100 - this.huurder.getKorting());
    }

    @Override
    public String toString() {
        return this.gehuurdeAuto + "\n" + this.huurder + "\n"
                + "aantal dagen: " + this.aantalDagen + " dat kost " + totaalPrijs();
    }
}
