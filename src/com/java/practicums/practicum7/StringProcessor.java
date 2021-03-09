package com.java.practicums.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();


    public StringProcessor() {

    }

    public String verwerk(String input){
        return input;
    }

    public void voegProcesToe(OpmaakProces proces) {
        processen.add(proces);
    }
}
