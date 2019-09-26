package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSumar {
    
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8, 2);
        assertTrue(instance.Sumar()==10);
        
    }
}
