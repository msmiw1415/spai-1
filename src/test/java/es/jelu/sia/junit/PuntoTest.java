package es.jelu.sia.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PuntoTest {

    @Test
    public void testPuntoIntInt() {
        Punto pt = new Punto(2, 2);
        assertEquals(pt.getX(), 2);
        assertEquals(pt.getY(), 2);
    }

    @Test
    public void testPunto() {
        Punto pt = new Punto();
        assertEquals(pt.getX(), 0);
        assertEquals(pt.getY(), 0);
    }

    @Test
    public void testModulo() {
        Punto pt = new Punto(2, 3);
        assertEquals(3.6055, pt.modulo(), 0.0001);
    }

    @Test
    public void testFase() {
        Punto pt = new Punto(3, 3);
        assertEquals(0.7853, pt.fase(), 0.0001);
    }

    @Test
    public void testToString() {
        Punto pt = new Punto(2, 3);
        assertEquals("Punto[2,3]", pt.toString());
    }

}