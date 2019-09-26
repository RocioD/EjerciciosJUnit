/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit002;

import java.util.ArrayList;
import modelos.ColeccionLibros;
import modelos.Libro;

/**
 *
 * @author rocio
 */
public class TestJUnit002 {

   
    public static void main(String[] args) {
        ColeccionLibros lista = new ColeccionLibros();
        Libro libro;
        String codigo;
 
        libro = new Libro("Lib001", "Titulo 1", "Autor 1"); lista.Agregar(libro);
        libro = new Libro("Lib002", "Titulo 2", "Autor 2"); lista.Agregar(libro);
        libro = new Libro("Lib003", "Titulo 3", "Autor 3"); lista.Agregar(libro);
        ListarLibros(lista.Listar());
        
        
        
    }
    
    public static void ListarLibros(ArrayList<Libro> lista){
        for (Libro obj:lista){
            System.out.println(obj.getCodigo());
            System.out.println(obj.getTitulo());
            System.out.println(obj.getAutor());
        }
    }
}
