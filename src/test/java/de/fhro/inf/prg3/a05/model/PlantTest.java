package de.fhro.inf.prg3.a05.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {
    Flower f1;
    Flower f2;
    Shrub s1;

    @BeforeEach
    void setUp() {
        f1 = new Flower(5, "Schneeglöckchen", PlantColor.BLUE);
        f2 = new Flower(5, "Rose", PlantColor.RED);
        s1 = new Shrub(5, "Staude", PlantColor.BLUE);
    }

    @Test
    void testFlowerColor(){
        assertEquals(PlantColor.BLUE, f1.getColor() );
        assertEquals(PlantColor.RED, f2.getColor());
    }

    @Test
    public void testShrubColor(){
        
    }

}