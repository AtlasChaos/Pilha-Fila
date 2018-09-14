/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Atlas
 */
public class PilhaVetor<T> implements Pilha<T> {
    
    private int n;
    
    private int tam;
    
    private T[] vet;
    
    public PilhaVetor(int tam) {
        this.tam = tam;
        this.vet = (T[]) new Object[this.tam];
    }
    
    @Override
    public void push(T v) throws Exception {
        if (this.n == this.tam) {
            throw new Exception("Pilha já cheia");
        }
        this.vet[n] = v;
        this.n++;
    }
    
    @Override
    public T pop() throws Exception {
        if (this.vazia()) {
            throw new Exception("Pilha já vazia");
        }
        T aRetirar = this.vet[n - 1];
        n--;
        return aRetirar;
    }
    
    @Override
    public T peek() {
        return this.vet[n - 1];
    }
    
    @Override
    public boolean vazia() {
        return n == 0;
    }
    
    @Override
    public void libera() throws Exception {
        while (n > 0) {
            this.pop();
        }
    }
    
}
