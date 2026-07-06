/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_duplaEncadeada_model;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }
    
    /**
     * Nós inseridos no começo da Lista Duplamente Encadeada
     * @param valor 
     */
    public void inserir(T valor){
        NoListaDupla novo = new NoListaDupla();
        novo.setInfo(valor);
        novo.setProximo(this.primeiro);
        //Null pois se tornará o primeiro nó
        novo.setAnterior(null);
        if(this.primeiro != null){
            this.primeiro.setAnterior(novo);
        }
        primeiro = novo;        
    }
    
    public NoListaDupla<T> buscar(T valor){
        NoListaDupla p = this.primeiro;
        
        while(p != null){
            if(p.equals(valor)){
                return p;
            }
        }
        
        return null;
    }
    
    public void retirar(T valor){
        NoListaDupla p = buscar(valor);
        
        if(p != null){ //achou nó ao buscar
            if(primeiro.equals(p)){//valida se for primeiro elemento da lista
                primeiro = p.getProximo();
            }else{
                p.getAnterior().setProximo(p.getProximo());
            }
            
            if(p.getProximo() != null){
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
        
    }
    
    public void exibirOrdemInversa(){
        
        NoListaDupla p = this.primeiro;
        NoListaDupla ultimo = new NoListaDupla();
        String txt = "";
        
        while(p != null){
            if(p.getProximo() == null){ //final da lista
                ultimo = p;
            }
        }
        
        p = ultimo;
        
        while(p != null){
            if(p.getAnterior()== null){
                txt += p.getInfo();
            }else{
                txt += p.getInfo() + ",";
            }
            p = p.getAnterior();
        }
        
        System.out.println(txt);
        
    }
    
    public void liberar(){
        
    }
    
    @Override
    public String toString() {
        String txt = "";
        NoListaDupla p = this.primeiro;
        
        while(p != null){
            if(p.getProximo() == null){
                txt += p.getInfo();
            }else{
                txt += p.getInfo() + ",";
            }
            p = p.getProximo();
        }
        
        return txt;
        
    }
    
    
    
    
}
