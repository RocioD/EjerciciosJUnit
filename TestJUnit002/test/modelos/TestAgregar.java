package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Libro libro = new Libro("Lib001", "Titulo 1", "Autor 1");
        ColeccionLibros instance = new ColeccionLibros();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
