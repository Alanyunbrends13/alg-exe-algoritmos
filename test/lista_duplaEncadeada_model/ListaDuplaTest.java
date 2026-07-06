/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lista_duplaEncadeada_model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ListaDuplaTest {
    
    public ListaDuplaTest(){
    }

    @Test //1
    public void validaLigacoesInserir() {
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(5, 5);
        assertEquals(10, 10);
        assertEquals(15, 15);
        assertEquals(20, 20);
        
        assertEquals("20,15,10,5", lista.toString());
        lista.exibirOrdemInversa();
    }
    
    @Test //2
    public void validaBuscaInicio(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.buscar(20).getInfo());
    }
    
    @Test //3
    public void validaBuscarMeio(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);        
        
        assertEquals(10, lista.buscar(10).getInfo());
    }
    
    @Test //4
    public void validaRemoverInicio(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);    
        lista.retirar(20);
        
        assertEquals("15,10,5", lista.toString());
    }
    
    @Test //5
    public void validaRemoverMeio(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);    
        lista.retirar(10);    
        
        assertEquals("20,15,5", lista.toString());
    }
    
    @Test //6
    public void validaRemoverUltimo(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);    
        lista.retirar(5);        
        
        assertEquals("20,15,10", lista.toString());
    }
    
    @Test //7
    public void validaLiberar(){
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.buscar(20).getInfo());
        assertEquals(15, lista.buscar(15).getInfo());
        assertEquals(10, lista.buscar(10).getInfo());
        assertEquals(5, lista.buscar(5).getInfo());
        
        lista.liberar();
        
        assertEquals(null, lista.getPrimeiro());
    }
    
    
    
}
