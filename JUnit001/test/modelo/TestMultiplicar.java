package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMultiplicar {
    
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(3, 3);
        assertTrue(instance.Multiplicar()==9);
    }
}
