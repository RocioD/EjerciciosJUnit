package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Libro libro = new Libro("Lib001", "Titulo 1", "Autor 1");
        ColeccionLibros instance = new ColeccionLibros();
        boolean esperado = true;
        instance.Agregar(libro);
        boolean obtenido = instance.Modificar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
