/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pilha_listaEncadeada_model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PilhaListaTest {
    
    public PilhaListaTest() {
    }

    @Test //1
    public void validaPilhaVazia() {
        PilhaLista<Integer> pilha = new PilhaLista();
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test //2
    public void validaPilhaComElemento(){
        PilhaLista<Integer> pilha = new PilhaLista();        
        pilha.push(10);
        
        assertEquals(false, pilha.estaVazia());
    }
    
    @Test //3
    public void validaPushEPop(){
        PilhaLista<Object> pilha = new PilhaLista();        
        pilha.push(10);        
        pilha.push(20);        
        pilha.push(30);        
        
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test //4
    public void validaPeek(){
        PilhaLista<Object> pilha = new PilhaLista();        
        pilha.push(10);        
        pilha.push(20);        
        pilha.push(30);        
        
        assertEquals(30, pilha.peek());
    }
    
    @Test //5
    public void validaLiberar(){
        PilhaLista<Object> pilha = new PilhaLista();        
        pilha.push(10);        
        pilha.push(20);        
        pilha.push(30);
        pilha.liberar();
        
        assertEquals(true, pilha.estaVazia());
    }
    
    
}
