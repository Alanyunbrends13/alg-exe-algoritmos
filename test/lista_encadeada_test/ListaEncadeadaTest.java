/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lista_encadeada_test;

import lista_encadeada_model.ListaEncadeada;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ListaEncadeadaTest {
    
    public ListaEncadeadaTest() {
    }

    @Test //1
    public void listaVazia() {
        ListaEncadeada lista = new ListaEncadeada();
        assertEquals(true, lista.estaVazia());
    }
    
    @Test //2
    public void listaComObjeto(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        assertEquals(false, lista.estaVazia());
    }
    
    @Test //3
    public void validaInclusao(){
        ListaEncadeada lista = new ListaEncadeada();        
        lista.inserir(5);
        lista.obterComprimento();
        assertEquals(1, lista.obterComprimento());
        lista.obterNo(0);
        assertEquals(5, lista.obterNo(0).getInfo());
    }
    
    @Test //4
    public void validarTresNumeros(){
        ListaEncadeada lista = new ListaEncadeada();        
        lista.inserir(5);        
        lista.inserir(10);        
        lista.inserir(15);        
        
        assertEquals(15, lista.obterNo(0).getInfo());
        assertEquals(10, lista.obterNo(1).getInfo());
        assertEquals(5, lista.obterNo(2).getInfo());
    }
    
    @Test //5
    public void validarBuscarPrimeiro(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.obterNo(0), lista.buscar(20));
    }
    
    @Test //6
    public void validaBuscarMeioLista(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);        
        assertEquals(lista.obterNo(1), lista.buscar(15));        
    }
    
    @Test //7
    public void validaBuscaNull(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);        
        assertEquals(null, lista.buscar(50));
    }
    
    @Test //8
    public void validaRetirar(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15,10,5", lista.toString());
    }
    
    @Test //9
    public void validaRetirarMeio(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);       
        lista.retirar(15);
        assertEquals("20,10,5", lista.toString());        
    }
    
    @Test //10
    public void validaObterNoZero(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);       
        lista.retirar(15);        
        assertEquals(20, lista.obterNo(0).getInfo());
    }
    
    @Test //11
    public void validaObterUltimoNo(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);              
        assertEquals(5, lista.obterNo(3).getInfo());        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)  //12
    public void validaObterNoInvalido(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.obterNo(10);
    }
    
    @Test //13
    public void validaComprimentoVazio(){
        ListaEncadeada lista = new ListaEncadeada();
        assertEquals(0, lista.obterComprimento());
    }
    
    @Test //14
    public void validaComprimento(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.obterComprimento());
    }
    
    
    
}
