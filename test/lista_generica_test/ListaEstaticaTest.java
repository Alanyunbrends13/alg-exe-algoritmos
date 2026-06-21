/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lista_generica_test;

import lista_generica_model.ListaEstatica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
    }

    @Test //1
    public void inverterPar() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inverter();
        
        assertEquals("20,15,10,5", lista.toString());
    }
    
    @Test
    public void inverterImpar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);
        lista.inverter();
        assertEquals("25,20,15,10,5", lista.toString());
    }
    
    
}
