

public abstract class FilaVetor<T> implements Fila<T> {

    int inicio;
    int tam;
    int qtdElem;
    T[] vet;

    public FilaVetor(int tam) {
        this.tam = tam;
        this.reseta();
    }
    
    
    public void reseta() {
        this.qtdElem = 0;
        this.inicio = 0;
        this.vet = (T[]) new Object[tam];        
    }

    @Override
    public void insere(T v) throws Exception {
        if (isFull()) {
            throw new Exception("Fila está cheia");
        } else if (vazia()) {
            qtdElem++;
            inicio = 0;
            vet[0] = v;

            return;
        }
        int fim = (qtdElem + inicio) % tam;
        qtdElem++;
        vet[fim] = v;
    }

    @Override
    public T retira() throws Exception {
        if (vazia()) {
            throw new Exception("Fila está vazia, não há nada a se retirar");
        }
        qtdElem--;
        T aRetornar = vet[inicio];
        inicio = (inicio + 1) % tam;
        return aRetornar;
    }

    @Override
    public boolean vazia() {
        return qtdElem == 0;
    }

    @Override
    public void libera() {
        this.reseta();
    }

    
    public boolean isFull() {
        return qtdElem == tam;
    }

}
