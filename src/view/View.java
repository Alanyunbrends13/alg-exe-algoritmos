/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import lista_duplaEncadeada_model.ListaDupla;




/**
 *
 * @author Usuario
 */
public class View {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.buscar(20);
    }
}
