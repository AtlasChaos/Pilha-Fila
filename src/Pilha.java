/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Atlas
 */
public interface Pilha<T> {
    
    public void push(T v) throws Exception;
    
    public T pop() throws Exception;
    
    public T peek();
    
    public boolean vazia();
    
    public void libera() throws Exception;
        
}
