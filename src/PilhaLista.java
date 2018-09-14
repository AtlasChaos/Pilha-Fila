/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Atlas
 */
public class PilhaLista<T> implements Pilha<T> {
    
    private ElementoLista<T> topo;
    
    @Override
    public void push(T v) throws Exception {
        ElementoLista novo = new ElementoLista(v);   
        if (!this.vazia()) {
            novo.setProx(this.topo);
        } 
        this.topo = novo;
    }

    @Override
    public T pop() throws Exception {
        if (this.vazia()) {
            throw new Exception("Lista vazia!");
        }
        ElementoLista<T> aSerRetirado = this.topo;
        this.topo = aSerRetirado.getProx();
        return aSerRetirado.getInfo();
    }

    @Override
    public T peek() {
        return this.topo.getInfo();
    }

    @Override
    public boolean vazia() {
        return topo == null;
    }

    @Override
    public void libera() throws Exception {
        while (!this.vazia()) {
            this.pop();
        }
    }

    
}
