/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import lista_encadeada_model.ListaEncadeada;




/**
 *
 * @author Usuario
 */
public class View {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        System.out.println(lista.toString());
    }
}
