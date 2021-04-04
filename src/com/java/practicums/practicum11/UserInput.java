package com.java.practicums.practicum11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welk bestand wil je openenen?");
        String src = sc.nextLine();

        if (new File(src).exists()) {
            System.out.println("Geef een naam op voor het nieuwe bestand?");
            String nieuw = sc.nextLine().replace(" ", "_");

            if (!nieuw.contains(".txt")) {
                nieuw = nieuw + ".txt";
            }

            System.out.println("Geef de waarde op van 1 US dollar in eurocent. (Alles achter de comma)");
            String waarde = sc.nextLine();


            if (!waarde.matches("[a-zA-Z]+")) {
                Double.parseDouble(waarde);
            } else {
                System.out.println("Geen geldige input, geldige input is bijv: 98.3243");
                System.exit(0);
            }


            BufferedReader br = new BufferedReader(new FileReader(src));
            Path pnf = Path.of(nieuw);
            Writer output = new BufferedWriter(Files.newBufferedWriter(pnf));


            String line;
            while ((line = br.readLine()) != null) {
                String newLine = line.split(" : ")[0] + " : " +
                        String.format("%.2f", Double.parseDouble(waarde) / 100 * Double.parseDouble(line.split(" : ")[1])) + "\n";
                output.append(newLine);

            }

            br.close();
            output.close();

        } else System.out.println("Bestand niet bekend");
    }
}