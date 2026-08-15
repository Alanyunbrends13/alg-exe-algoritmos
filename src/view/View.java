/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import pilha_vetor_model.PilhaVetor;




/**
 *
 * @author Usuario
 */
public class View {
    public static void main(String[] args) {
        PilhaVetor pilhaA = new PilhaVetor(5);
        pilhaA.push(10);
        pilhaA.push(20);
        pilhaA.push(30);
        
        PilhaVetor pilhaB = new PilhaVetor(5);
        pilhaB.push(40);
        pilhaB.push(50);
        
        pilhaA.concatenar(pilhaB);
        
        System.out.println(pilhaA.toString());
    }
}
