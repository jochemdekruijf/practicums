package com.java.practicums.practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }

    public void schafAan(Goed g) {
        if (alleGoederen.size() != 0){
            for (Goed a : alleGoederen) {
                if (a.equals(g)) return;
            }
        }
        if (budget - g.huidigeWaarde() < 0) return;
        alleGoederen.add(g);
        budget -= g.huidigeWaarde();
    }

    @Override
    public String toString() {
        return "BedrijfsInventaris{" +
                "bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", budget=" + budget +
                ", alleGoederen=" + alleGoederen +
                '}';
    }
}



