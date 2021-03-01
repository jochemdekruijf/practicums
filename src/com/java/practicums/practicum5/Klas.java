package com.java.practicums.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();

    public Klas(String kC) {
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerlingen)
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
            }
    }

    public ArrayList<Leerling> getLeerlingen() {
            return this.leerlingen;
    }

    public int aantalLeerlingen() {
        return this.leerlingen.size();
    }

    @Override
    public String toString() {
        String string = "In klas" + klasCode + " zitten de volgende leerlingen: \n";
        for (Leerling l : leerlingen) {
            string += l + "\n";
        }

        return string;
    }
}
