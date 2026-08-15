/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pilha_vetor_model;

/**
 *
 * @author Usuario
 */
public interface Pilha<T> {
    
    void push(T valor);
    T pop();
    T peek();
    boolean estaVazia();
    void liberar();
    
}
