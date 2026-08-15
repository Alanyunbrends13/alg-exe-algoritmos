/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pilha_vetor_test;

import pilha_vetor_model.PilhaCheiaException;
import pilha_vetor_model.PilhaVaziaException;
import pilha_vetor_model.PilhaVetor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PilhaVetorTest {
    
    public PilhaVetorTest() {
    }

    @Test //1
    public void validaEstaVazio() {
        PilhaVetor pilha = new PilhaVetor(10);
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test //2
    public void validaFalseEstaVazio(){
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        assertEquals(false, pilha.estaVazia());
    }
    
    @Test //3
    public void validarEmpilharDesempilhar(){
        PilhaVetor pilha = new PilhaVetor(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertEquals(true, pilha.estaVazia());
    }
    
    //4
    @Test(expected = PilhaCheiaException.class) 
    public void validaExcecaoPilhaCheia(){
        PilhaVetor pilha = new PilhaVetor(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
    }
    
    //5
    @Test(expected = PilhaVaziaException.class)
    public void validaExcessaoPilhaVazia(){
        PilhaVetor pilha = new PilhaVetor(10);
        pilha.pop();
    }
    
    @Test //6
    public void validaPeek(){
        PilhaVetor pilha = new PilhaVetor(5);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        assertEquals(30, pilha.peek());
    }
    
    @Test //7
    public void validaLiberar(){
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test //8
    public void validaConcatenar(){
        PilhaVetor pilhaUm = new PilhaVetor(10);
        pilhaUm.push(10);
        pilhaUm.push(20);
        pilhaUm.push(30);
        
        PilhaVetor pilhaDois = new PilhaVetor(10);
        pilhaDois.push(40);
        pilhaDois.push(50);
        
        pilhaUm.concatenar(pilhaDois);
        assertEquals("50,40,30,20,10", pilhaUm.toString());
    }
}
