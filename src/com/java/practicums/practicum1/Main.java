package com.java.practicums.practicum1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Opdracht 1: Getallenlijst: For");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.print(System.lineSeparator());
        System.out.println("Opdracht 2: Getallenlijst: While");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.print(System.lineSeparator());
        System.out.println("Opdracht 3: Random getallen");
        for(i = 1; i <= 10; i++) {
            int random = (int)(Math.random() * 69);
            System.out.println("(" + i + ") " + random);
        }

        System.out.print(System.lineSeparator());
        System.out.println("Opdracht 4: Som van gehele getallen");
        int totaal = 0;
        for(i = 0; i <= 39; i++) {
            totaal += i;
        }
        System.out.println("Totaal: " + totaal);

        System.out.print(System.lineSeparator());
        System.out.println("Opdracht 5: Zaagtandpatroon");
        for(i = 0; i <= 20; i++) {
            if ( i % 2 == 0 ) {
                System.out.println("S");
            }else {
                System.out.println("SS");
            }
        }
    }
}
