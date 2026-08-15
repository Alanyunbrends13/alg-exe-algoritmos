/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha_listaEncadeada_model;

import pilha_vetor_model.*;

/**
 *
 * @author Usuario
 */
public class PilhaVaziaException extends RuntimeException{
    public PilhaVaziaException(String mensagem){
        super(mensagem);
    }
    //não necessariamente precisa da parte acima
}

//runtime exception diz que deu Erro de Execução - muito genérico
//dessa forma, pontua o estado que ocorreu o erro
