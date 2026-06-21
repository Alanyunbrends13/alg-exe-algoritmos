/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_generica_model;

/**
 *
 * @author Usuario
 * @param <T> - Qualquer Classe
 */
public class ListaEstatica<T> {
    private Object info[];
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String text = "";
        for(int i=0; i<tamanho; i++){
            if(i == tamanho-1){
                text+= info[i];
            }else{
                text += info[i] + ",";
            }
        }
        return text;
    }
    
    public ListaEstatica(){
        this.info = (T[]) new Object[10];
        this.tamanho = 0;
    }
    
    public void inserir(T valor){
        if(tamanho == info.length){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }
    
    private void redimensionar(){
        Object[] novo;
        
        int novoTamanho = info.length + 10;
        novo = new Object[novoTamanho]; // instancia na memória com o 'new'
        for(int i=0; i<= tamanho-1; i++){
            novo[i] = info[i];
        }
        
        info = novo;
    }
    
    public void exibir(){
        String numeros = "";
        for(int i=0; i<= tamanho-1; i++){
            numeros = info[i] + " ";
        }
        
        System.out.println("Lista: [ " + numeros + "]" );
    }
    
    public int buscar(T valor){
        for(int i=0; i<tamanho; i++){
            if(info[i].equals(valor)){
                return i;
            }
        }
        
        return -1;
    }
    
    public void retirar(T valor){
        int posicaoValor = buscar(valor);
        if(posicaoValor == tamanho-1){
            info[posicaoValor] = 0;
        }else{
            for(int i=posicaoValor; i<tamanho; i++){
                info[i] = info[i+1];
            }

        }
        tamanho--;
    }
    
    public void liberar(){
        this.tamanho = 0;
        this.info = new Object[tamanho];
    }
    
    public T obterElemento(int posicao){
        if(posicao >= this.tamanho || posicao < 0){
            throw new IndexOutOfBoundsException();
        }
        return (T) info[posicao];
    }
    
    public boolean estaVazia(){
        return tamanho == 0;
    }
    
    public void inverter(){
        //usar apenas uma variável, sem precisar criar vetor
        //PASSO:
        //faz backup do elemento no indice 0
        //copia o valor do último para o primeiro
        //cola o backup para o último índice
        //segue para o próximo índice até chegar ao último elemento
        //Utilizar laço de repetição
        
        //dividir a variável tamanho por 2 = vezes que será executado 
        //o backup para inserir na variável do vetor
        
        T backup; // 0 pois começa pelo início do vetor
        int valorTrocar = tamanho-1;
        for(int i=0; i < this.tamanho/2; i++){
            backup = (T) info[i]; // necessário casting
            info[i] = info[valorTrocar];
            info[valorTrocar] = backup;
            valorTrocar--;
        }
        
    }
    
    
    
    
    
    
    
}
