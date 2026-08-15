/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha_listaEncadeada_model;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class PilhaLista<T> implements Pilha<T>{
    ListaEncadeada<T> lista = new ListaEncadeada<>();

    @Override
    public void push(T valor) {
        lista.inserir(valor);
    }

    @Override
    public T pop() {
        T valor;
        valor = peek();
        lista.retirar(valor);
        
        return valor;
    }

    @Override
    public T peek() {
        
        if(estaVazia()){
            throw new PilhaVaziaException("ERRO! Pilha está vazia");
        }
        
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        this.lista = new ListaEncadeada<>();
    }
    
    public String toString(){
        return lista.toString();
    }    
    
}