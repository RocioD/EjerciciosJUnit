package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestDividir {
    
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(9, 3);
        assertTrue(instance.Dividir()==3);
    }
}
