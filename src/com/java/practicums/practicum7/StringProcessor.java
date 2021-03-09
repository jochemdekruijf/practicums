package com.java.practicums.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<>();


    public StringProcessor() {

    }

    public String verwerk(String input){
        for (OpmaakProces p : processen) input = p.maakOp(input);
        return input;
    }

    public void voegProcesToe(OpmaakProces proces) {
        processen.add(proces);
    }
}
