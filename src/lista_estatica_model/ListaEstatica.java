/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_estatica_model;

/**
 *
 * @author Usuario
 */
public class ListaEstatica {
    private int info[];
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
        this.info = new int[10];
        this.tamanho = 0;
    }
    
    public void inserir(int valor){
        if(tamanho == info.length){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }
    
    private void redimensionar(){
        int[] novo;
        
        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho]; // instancia na memória com o 'new'
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
    
    public int buscar(int valor){
        for(int i=0; i<tamanho; i++){
            if(info[i] == valor){
                return i;
            }
        }
        
        return -1;
    }
    
    public void retirar(int valor){
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
        this.info = new int[tamanho];
    }
    
    public int obterElemento(int posicao){
        if(posicao >= this.tamanho || posicao < 0){
            throw new IndexOutOfBoundsException();
        }
        return info[posicao];
    }
    
    public boolean estaVazia(){
        return tamanho == 0;
    }
    
    
    
    
    
    
    
}
