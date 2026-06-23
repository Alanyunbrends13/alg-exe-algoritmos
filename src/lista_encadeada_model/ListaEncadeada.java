/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_encadeada_model;

/**
 *
 * @author Usuario
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor){
        NoLista novo = new NoLista();
        novo.setInfo(valor);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }
    
    public NoLista<T> buscar(T valor){
        NoLista p = this.primeiro;
        while(p != null){
            if(p.getInfo().equals(valor)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor){
        NoLista anterior = null;
        NoLista p = this.primeiro;
        
        while((p != null) && (p.getInfo() != valor)){
            anterior = p;
            p = p.getProximo();
        }
        
        //Se achou o nó, irá retirar
        if(p != null){
            if(p == this.primeiro){
                this.primeiro = p.getProximo();
            }else{
                anterior.setProximo(p.getProximo());
            }
        }
    }
    
    public int obterComprimento(){
        NoLista p = this.primeiro;
        int qtd = 0;
        
        while(p != null){
            qtd++;
            p = p.getProximo();
        }
        
        return qtd;
    }
    
    public NoLista<T> obterNo(int idx){
        if(idx < 0 || idx > (obterComprimento() -1)){
            throw new IndexOutOfBoundsException("Nó fora do intervalo limite");
        }
        
        NoLista p = this.primeiro;
        
        for(int i=0; i<idx; i++){
            p = p.getProximo();
        }
        
        return p;
    }

    @Override
    public String toString() {
        String txt = "";
        NoLista p = this.primeiro;
        
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
