package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void TestEliminar() {
        System.out.println("Eliminar");
        String codigo="Lib001";
        Libro libro = new Libro("Lib001", "Titulo 1", "Autor 1");
        ColeccionLibros instance = new ColeccionLibros();
        boolean esperado = true;
        instance.Agregar(libro);
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
