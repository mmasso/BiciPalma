package edu.elsmancs;
import static org.junit.Assert.*;
import org.junit.Test;

public class testEstacion {

    @Test
    public void testGetEstacion(){
        Estacion estacion = new Estacion((1, "Manacor", 6))
        assertEquals(estacion);
    }
}