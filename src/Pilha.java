
public interface Pilha<T> {
    
    public void push(T v) throws Exception;
    
    public T pop() throws Exception;
    
    public T peek();
    
    public boolean vazia();
    
    public void libera() throws Exception;
    
    
        
}
