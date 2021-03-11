package com.java.practicums.practicum8;



public class Main {
    public static void main(String[] args) {

        BedrijfsInventaris bedrijfsinv = new BedrijfsInventaris("Bedrijf", 500000);
        Computer computer1 = new Computer("Apple", "1234ABc", 2259, 2010);
        Computer computer2 = new Computer("Apple", "1234ABc", 2259, 2010);
        Fiets fiets1 = new Fiets("batavus", 355, 2002, 67);
        Fiets fiets2 = new Fiets("batavus", 355, 2002, 67);
        Auto auto1 = new Auto("BMW", 17500, 2008, "12-ABc_32");
        Auto auto2 = new Auto("BMW", 17500, 2008, "12-ABc_32");
        Computer computer3 = new Computer("Android", "1265ABc", 1259, 2015);
        Fiets fiets3 = new Fiets("Gazelle", 555, 2010, 73);
        Auto auto3 = new Auto("Volkswagen", 12500, 2013, "12-ADF-32");

        bedrijfsinv.schafAan(computer3);
        bedrijfsinv.schafAan(fiets3);
        bedrijfsinv.schafAan(auto3);
        System.out.println(bedrijfsinv);

    }
}
