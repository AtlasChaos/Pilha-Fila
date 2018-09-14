/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atlas
 */
public interface Fila<T> {

    public void insere(T v) throws Exception;

    public T retira() throws Exception;

    public boolean vazia();

    public void libera();
    
    public Fila<T> concatenar(Fila outra) throws Exception;

}
