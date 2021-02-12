package com.java.practicums.practicum2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VoetbalclubTest {
    private Voetbalclub vb1;
    private Voetbalclub vb2;
    private Voetbalclub vb3;

    @BeforeEach
    public void init(){
        vb1 = new Voetbalclub(null);

    }


    @BeforeEach
    public void init2(){
        vb2 = new Voetbalclub(" ");

    }
    @BeforeEach
    public void init3(){
        vb3 = new Voetbalclub("Club");

    }


    @Test
    void testNullGewonnen(){
        vb1.verwerkResultaat('w');
        assertEquals("FC 1 1 0 0 3", vb1.toString());

    }

    @Test
    void testLeegGewonnen(){
        vb2.verwerkResultaat('w');
        assertEquals("FC 1 1 0 0 3", vb2.toString());

    }

    @Test
    void testNaamGewonnen(){
        vb3.verwerkResultaat('w');
        assertEquals("Club 1 1 0 0 3", vb3.toString());

    }

    @Test
    void testNullGelijk(){
        vb1.verwerkResultaat('g');
        assertEquals("FC 1 0 1 0 1", vb1.toString());

    }

    @Test
    void testLeegGelijk(){
        vb2.verwerkResultaat('g');
        assertEquals("FC 1 0 1 0 1 ", vb2.toString());

    }

    @Test
    void testNaamGelijk(){
        vb3.verwerkResultaat('g');
        assertEquals("Club 1 0 1 0 1 ", vb3.toString());

    }

    @Test
    void testNullVerloren(){
        vb1.verwerkResultaat('v');
        assertEquals("FC 1 0 0 1 0", vb1.toString());


    }

    @Test
    void testLeegVerloren(){
        vb2.verwerkResultaat('v');
        assertEquals("FC 1 0 0 1 0", vb2.toString());
    }

    @Test
    void testNaamVerloren(){
        vb3.verwerkResultaat('v');
        assertEquals("Club 1 0 0 1 0", vb3.toString());

    }







}