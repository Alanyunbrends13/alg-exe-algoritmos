/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model_lista_estatica.ListaEstatica;

/**
 *
 * @author Usuario
 */
public class View {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        System.out.println(lista.toString());
    }
}
