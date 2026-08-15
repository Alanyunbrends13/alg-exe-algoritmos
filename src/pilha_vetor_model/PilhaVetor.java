/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha_vetor_model;

/**
 *
 * @author Usuario
 */
public class PilhaVetor<T> implements Pilha<T>{

    private Object[] info;
    private int limite;
    private int tamanho;
    
    public PilhaVetor(int limite){
        this.limite = limite;
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;        
    }
    
    @Override
    public void push(T valor) {
        if(limite == tamanho){
            throw new PilhaCheiaException("Erro ao adicionar! A pilha está cheia");
        }
        info[tamanho] = valor;
        tamanho++;
    }
    
    /**
     * Valida o valor que está no topo da pilha.
     * @return - T topo da pilha
     */
    @Override
    public T peek() {
        if(estaVazia()){
            throw new PilhaVaziaException("Erro ao buscar topo! Pilha está vazia");
        }
        return (T) info[tamanho-1];
    }

    /**
     * Retira o valor que está no topo da pilha e retorna esse valor
     * @return T - topo da pilha
     */
    @Override
    public T pop() {
        T valor = peek();
        tamanho--;
        return valor;
    }    

    /**
     * Retorna sim ou não caso a pilha esteja sem nenhum elemento adicionado,
     * ou seja, vazia
     * @return - boolean return: true se vazia e false se com elementos
     */
    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    /**
     * O método irá remover todos os elementos do vetor, executando manualmente o método do pop()
     * Outra opção que poderia ser feita é criar um novo vetor e referenciar o info[] a esse novo vetor
     */
    @Override
    public void liberar() {
        while(!estaVazia()){
            pop();
        }
        //this.info = new Object[limite];
    }
    
    public String toString(){
        String txt = "";
        
        for(int i= this.tamanho-1; i > 0; i--){
            txt += this.info[i] + ",";
        }
        
        txt = txt + this.info[0];
        
        return txt;
    }
    
    public void concatenar(PilhaVetor<T> p){
        
        if((this.limite - this.tamanho) < p.getTamanho()){
            throw new PilhaCheiaException("ERRO! Pilha corrente não possui capacidade");
        }
        
        int vetorB = 0;
        
        for(int i = p.getTamanho()-1; i >= 0; i--){
            this.push((T) p.getInfo()[vetorB]);
            vetorB++;
        }
        
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getLimite() {
        return limite;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }
    
    
    
    
    
}
