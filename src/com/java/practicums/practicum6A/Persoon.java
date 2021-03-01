package com.java.practicums.practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public boolean koop(Game g) {
        if (this.budget >= g.huidigeWaarde()) {
            for (Game game : games) {
                if (game.equals(g)) {
                    return false;
                }
            }
            games.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (games.contains(g)) {
            if (koper.koop(g)) {
                budget += g.huidigeWaarde();
                games.remove(g);
                return true;
            }
        }
        return false;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        String string = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for (Game g : games) {
            string += "\n" + g;
        }
        return string;

    }
}
