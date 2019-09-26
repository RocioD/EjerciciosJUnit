package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {
    
    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8, 3);
        assertTrue(instance.Restar()==5);
    }

}
