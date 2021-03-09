package com.java.practicums.practicum8;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }

    public void schafAan( Goed g){

    }

    @Override
    public String toString() {
        return "BedrijfsInventaris{" +
                "bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", budget=" + budget +
                '}';
    }
}



