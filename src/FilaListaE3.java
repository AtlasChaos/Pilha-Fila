
public class FilaListaE3<T> extends FilaListaEncadeada<T> {

    @Override
    public String toString() {

        ElementoLista<T> andarilho = ini;
        String str = "[ ";
        while (andarilho != null) {
            str += andarilho.getInfo() + ", ";
            andarilho = andarilho.getProx();
        }
        str = str.substring(0, str.length() - 2) + "]";
        return str;
    }

    @Override
    public Fila<T> concatenar(Fila outra) throws Exception {

        Fila<T> filaListaEncadeada = new FilaListaE3<>();
        ElementoLista<T> andarilho = this.ini;

        while (andarilho != null) {
            filaListaEncadeada.insere((T) andarilho.getInfo());
            andarilho = andarilho.getProx();
        }

        /*if (outra instanceof FilaListaEncadeada) {

            andarilho = ((FilaListaEncadeada<T>) outra).ini;

            while (andarilho != null) {
                newQueue.insere((T) andarilho.getInfo());
                andarilho.getProx();
            }
            return newQueue;
        } else {
            
            T elemVetor = ((FilaVetor<T>) outra).vet[((FilaVetor<T>)outra).inicio]; 
            while (((FilaVetor<T>)outra).vet[((FilaVetor<T>)outra).inicio] != null){
                
            }
                
        }*/
        filaListaEncadeada.insere((T) outra);

        return filaListaEncadeada;

    }

}
