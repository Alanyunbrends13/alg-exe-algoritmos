/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model_lista_estatica;

import model_lista_estatica.ListaEstatica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
    }

    @Test
    public void inclusaoLista() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5,10,15,20", lista.toString());
    }
    
    @Test
    public void obterTamanhoLista(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }
    
    @Test
    public void buscarExiste(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(2, lista.buscar(15));
    }
    
    @Test
    public void retirar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertEquals("5,15,20", lista.toString());
    }
    
    @Test
    public void causarRedimensionar(){
        ListaEstatica lista = new ListaEstatica();
        for(int i=1; i<=15; i++){
            lista.inserir(i);
        }
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", lista.toString());
    }
    
    @Test
    public void testarObterElemento(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);       
        assertEquals(20, lista.obterElemento(3));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testarLançamentoExcecao(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        lista.obterElemento(5);
    }
    
    @Test
    public void liberarValidado(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        lista.liberar();
        assertEquals(true, lista.estaVazia());
    }
    
}
