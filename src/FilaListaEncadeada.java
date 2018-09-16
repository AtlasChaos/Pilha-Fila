
public abstract class FilaListaEncadeada<T> implements Fila<T> {

    protected ElementoLista<T> ini;
    protected ElementoLista<T> fim;

    @Override
    public void insere(T v) throws Exception {
        ElementoLista<T> newElem = new ElementoLista(v);
        if (vazia()) {
            ini = newElem;
            fim = newElem;

        } else {
            fim.setProx(newElem);
            fim = newElem;
        }

    }

    @Override
    public T retira() throws Exception {
        if (vazia()) {
            throw new Exception("Fila está vazia, não há nada a se retirar");
        }
        T aRetornar = ini.getInfo();
        ini = ini.getProx();
        return aRetornar;

    }

    @Override
    public boolean vazia() {
        return ini == null;
    }

    @Override
    public void libera() {
        ini = null;
        fim = null;
        System.gc();
    }
    
   
    
    
    
}
